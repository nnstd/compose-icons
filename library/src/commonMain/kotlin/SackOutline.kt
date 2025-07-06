package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SackOutline: ImageVector
    get() {
        if (_SackOutline != null) {
            return _SackOutline!!
        }
        _SackOutline = ImageVector.Builder(
            name = "SackOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 18.28f)
                verticalLineTo(18.05f)
                curveTo(18.95f, 17.88f, 18.9f, 17.63f, 18.83f, 17.32f)
                curveTo(18.69f, 16.69f, 18.46f, 15.85f, 18.13f, 14.95f)
                curveTo(17.5f, 13.23f, 16.58f, 11.74f, 15.47f, 11f)
                horizontalLineTo(8.53f)
                curveTo(7.42f, 11.74f, 6.5f, 13.23f, 5.87f, 14.95f)
                curveTo(5.54f, 15.85f, 5.31f, 16.69f, 5.17f, 17.32f)
                curveTo(5.1f, 17.63f, 5.05f, 17.88f, 5f, 18.05f)
                verticalLineTo(18.29f)
                lineTo(4.97f, 18.39f)
                lineTo(4.95f, 18.45f)
                curveTo(4.94f, 18.5f, 4.94f, 18.55f, 4.94f, 18.63f)
                curveTo(4.94f, 18.79f, 4.97f, 18.96f, 5.04f, 19.11f)
                curveTo(5.09f, 19.21f, 5.5f, 20f, 8f, 20f)
                horizontalLineTo(16f)
                curveTo(18.5f, 20f, 18.91f, 19.21f, 18.96f, 19.11f)
                curveTo(19.03f, 18.96f, 19.06f, 18.79f, 19.06f, 18.63f)
                curveTo(19.06f, 18.55f, 19.06f, 18.5f, 19.05f, 18.45f)
                lineTo(19.03f, 18.39f)
                lineTo(19f, 18.29f)
                verticalLineTo(18.28f)
                moveTo(3f, 18f)
                curveTo(3f, 18f, 4f, 11f, 8f, 9f)
                horizontalLineTo(16f)
                curveTo(20f, 11f, 21f, 18f, 21f, 18f)
                curveTo(21f, 18f, 22f, 22f, 16f, 22f)
                horizontalLineTo(8f)
                curveTo(2f, 22f, 3f, 18f, 3f, 18f)
                moveTo(10f, 4f)
                lineTo(12f, 2f)
                lineTo(14f, 4f)
                lineTo(18f, 2f)
                lineTo(16f, 7f)
                horizontalLineTo(8f)
                lineTo(6f, 2f)
                lineTo(10f, 4f)
                close()
            }
        }.build()

        return _SackOutline!!
    }

@Suppress("ObjectPropertyName")
private var _SackOutline: ImageVector? = null
