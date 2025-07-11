package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RecycleVariant: ImageVector
    get() {
        if (_RecycleVariant != null) {
            return _RecycleVariant!!
        }
        _RecycleVariant = ImageVector.Builder(
            name = "RecycleVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.17f, 7.91f)
                lineTo(8.9f, 8.91f)
                lineTo(12.08f, 3.42f)
                lineTo(14.33f, 7.31f)
                lineTo(11.73f, 8.81f)
                lineTo(17.19f, 10.27f)
                lineTo(18.66f, 4.81f)
                lineTo(16.06f, 6.31f)
                lineTo(13.81f, 2.41f)
                curveTo(13.26f, 1.45f, 12.03f, 1.12f, 11.08f, 1.68f)
                curveTo(10.81f, 1.83f, 10.58f, 2.05f, 10.41f, 2.31f)
                moveTo(10f, 20f)
                verticalLineTo(18f)
                lineTo(3.66f, 18f)
                lineTo(5.9f, 14.1f)
                lineTo(8.5f, 15.6f)
                lineTo(7.04f, 10.14f)
                lineTo(1.57f, 11.6f)
                lineTo(4.17f, 13.1f)
                lineTo(1.92f, 17f)
                curveTo(1.37f, 17.96f, 1.7f, 19.18f, 2.65f, 19.73f)
                curveTo(2.92f, 19.89f, 3.22f, 19.97f, 3.54f, 20f)
                moveTo(19.06f, 11.5f)
                lineTo(17.32f, 12.5f)
                lineTo(20.5f, 18f)
                horizontalLineTo(16f)
                verticalLineTo(15f)
                lineTo(12f, 19f)
                lineTo(16f, 23f)
                verticalLineTo(20f)
                horizontalLineTo(20.5f)
                curveTo(21.61f, 20f, 22.5f, 19.11f, 22.5f, 18f)
                curveTo(22.5f, 17.69f, 22.42f, 17.38f, 22.28f, 17.11f)
                close()
            }
        }.build()

        return _RecycleVariant!!
    }

@Suppress("ObjectPropertyName")
private var _RecycleVariant: ImageVector? = null
