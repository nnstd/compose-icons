package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Bat: ImageVector
    get() {
        if (_Bat != null) {
            return _Bat!!
        }
        _Bat = ImageVector.Builder(
            name = "Bat",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0.75f, 8f)
                curveTo(0.75f, 8f, 5f, 7f, 8f, 9f)
                curveTo(8f, 9f, 8.5f, 12.75f, 10.5f, 12.75f)
                verticalLineTo(11f)
                curveTo(10.5f, 11f, 11f, 12f, 12f, 12f)
                curveTo(13f, 12f, 13.5f, 11f, 13.5f, 11f)
                verticalLineTo(12.75f)
                curveTo(15.5f, 12.75f, 16f, 9f, 16f, 9f)
                curveTo(19f, 7f, 23.25f, 8f, 23.25f, 8f)
                curveTo(21.25f, 9f, 21f, 12.5f, 21f, 12.5f)
                curveTo(17f, 12.5f, 17f, 15.75f, 17f, 15.75f)
                curveTo(12f, 14.75f, 12f, 18.5f, 12f, 18.5f)
                curveTo(12f, 18.5f, 12f, 14.75f, 7f, 15.75f)
                curveTo(7f, 15.75f, 7f, 12.5f, 3f, 12.5f)
                curveTo(3f, 12.5f, 2.75f, 9f, 0.75f, 8f)
                close()
            }
        }.build()

        return _Bat!!
    }

@Suppress("ObjectPropertyName")
private var _Bat: ImageVector? = null
