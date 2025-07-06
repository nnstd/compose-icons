package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Alien: ImageVector
    get() {
        if (_Alien != null) {
            return _Alien!!
        }
        _Alien = ImageVector.Builder(
            name = "Alien",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 3f)
                curveTo(16.97f, 3f, 21f, 6.58f, 21f, 11f)
                curveTo(21f, 15.42f, 15f, 21f, 12f, 21f)
                curveTo(9f, 21f, 3f, 15.42f, 3f, 11f)
                curveTo(3f, 6.58f, 7.03f, 3f, 12f, 3f)
                moveTo(10.31f, 10.93f)
                curveTo(9.29f, 9.29f, 7.47f, 8.58f, 6.25f, 9.34f)
                curveTo(5.03f, 10.1f, 4.87f, 12.05f, 5.89f, 13.69f)
                curveTo(6.92f, 15.33f, 8.74f, 16.04f, 9.96f, 15.28f)
                curveTo(11.18f, 14.5f, 11.33f, 12.57f, 10.31f, 10.93f)
                moveTo(13.69f, 10.93f)
                curveTo(12.67f, 12.57f, 12.82f, 14.5f, 14.04f, 15.28f)
                curveTo(15.26f, 16.04f, 17.08f, 15.33f, 18.11f, 13.69f)
                curveTo(19.13f, 12.05f, 18.97f, 10.1f, 17.75f, 9.34f)
                curveTo(16.53f, 8.58f, 14.71f, 9.29f, 13.69f, 10.93f)
                moveTo(12f, 17.75f)
                curveTo(10f, 17.75f, 9.5f, 17f, 9.5f, 17f)
                curveTo(9.5f, 17.03f, 10f, 19f, 12f, 19f)
                curveTo(14f, 19f, 14.5f, 17f, 14.5f, 17f)
                curveTo(14.5f, 17f, 14f, 17.75f, 12f, 17.75f)
                close()
            }
        }.build()

        return _Alien!!
    }

@Suppress("ObjectPropertyName")
private var _Alien: ImageVector? = null
