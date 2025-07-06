package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HelpRhombusOutline: ImageVector
    get() {
        if (_HelpRhombusOutline != null) {
            return _HelpRhombusOutline!!
        }
        _HelpRhombusOutline = ImageVector.Builder(
            name = "HelpRhombusOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 15.5f)
                horizontalLineTo(12.5f)
                verticalLineTo(17f)
                horizontalLineTo(11f)
                verticalLineTo(15.5f)
                moveTo(12f, 6.95f)
                curveTo(14.7f, 7.06f, 15.87f, 9.78f, 14.28f, 11.81f)
                curveTo(13.86f, 12.31f, 13.19f, 12.64f, 12.85f, 13.07f)
                curveTo(12.5f, 13.5f, 12.5f, 14f, 12.5f, 14.5f)
                horizontalLineTo(11f)
                curveTo(11f, 13.65f, 11f, 12.94f, 11.35f, 12.44f)
                curveTo(11.68f, 11.94f, 12.35f, 11.64f, 12.77f, 11.31f)
                curveTo(14f, 10.18f, 13.68f, 8.59f, 12f, 8.46f)
                curveTo(11.18f, 8.46f, 10.5f, 9.13f, 10.5f, 9.97f)
                horizontalLineTo(9f)
                curveTo(9f, 8.3f, 10.35f, 6.95f, 12f, 6.95f)
                moveTo(12f, 2f)
                curveTo(11.5f, 2f, 11f, 2.19f, 10.59f, 2.59f)
                lineTo(2.59f, 10.59f)
                curveTo(1.8f, 11.37f, 1.8f, 12.63f, 2.59f, 13.41f)
                lineTo(10.59f, 21.41f)
                curveTo(11.37f, 22.2f, 12.63f, 22.2f, 13.41f, 21.41f)
                lineTo(21.41f, 13.41f)
                curveTo(22.2f, 12.63f, 22.2f, 11.37f, 21.41f, 10.59f)
                lineTo(13.41f, 2.59f)
                curveTo(13f, 2.19f, 12.5f, 2f, 12f, 2f)
                moveTo(12f, 4f)
                lineTo(20f, 12f)
                lineTo(12f, 20f)
                lineTo(4f, 12f)
                close()
            }
        }.build()

        return _HelpRhombusOutline!!
    }

@Suppress("ObjectPropertyName")
private var _HelpRhombusOutline: ImageVector? = null
