package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TooltipQuestionOutline: ImageVector
    get() {
        if (_TooltipQuestionOutline != null) {
            return _TooltipQuestionOutline!!
        }
        _TooltipQuestionOutline = ImageVector.Builder(
            name = "TooltipQuestionOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 2f)
                horizontalLineTo(4f)
                curveTo(3.47f, 2f, 2.96f, 2.21f, 2.59f, 2.59f)
                curveTo(2.21f, 2.96f, 2f, 3.47f, 2f, 4f)
                verticalLineTo(16f)
                curveTo(2f, 16.53f, 2.21f, 17.04f, 2.59f, 17.41f)
                curveTo(2.96f, 17.79f, 3.47f, 18f, 4f, 18f)
                horizontalLineTo(8f)
                lineTo(12f, 22f)
                lineTo(16f, 18f)
                horizontalLineTo(20f)
                curveTo(20.53f, 18f, 21.04f, 17.79f, 21.41f, 17.41f)
                reflectiveCurveTo(22f, 16.53f, 22f, 16f)
                verticalLineTo(4f)
                curveTo(22f, 3.47f, 21.79f, 2.96f, 21.41f, 2.59f)
                curveTo(21.04f, 2.21f, 20.53f, 2f, 20f, 2f)
                moveTo(4f, 16f)
                verticalLineTo(4f)
                horizontalLineTo(20f)
                verticalLineTo(16f)
                horizontalLineTo(15.17f)
                lineTo(12f, 19.17f)
                lineTo(8.83f, 16f)
                moveTo(10.05f, 6.04f)
                curveTo(10.59f, 5.68f, 11.3f, 5.5f, 12.19f, 5.5f)
                curveTo(13.13f, 5.5f, 13.88f, 5.71f, 14.42f, 6.12f)
                curveTo(14.96f, 6.54f, 15.23f, 7.1f, 15.23f, 7.8f)
                curveTo(15.23f, 8.24f, 15.08f, 8.63f, 14.79f, 9f)
                curveTo(14.5f, 9.36f, 14.12f, 9.64f, 13.66f, 9.85f)
                curveTo(13.4f, 10f, 13.23f, 10.15f, 13.14f, 10.32f)
                curveTo(13.05f, 10.5f, 13f, 10.72f, 13f, 11f)
                horizontalLineTo(11f)
                curveTo(11f, 10.5f, 11.1f, 10.16f, 11.29f, 9.92f)
                curveTo(11.5f, 9.68f, 11.84f, 9.4f, 12.36f, 9.08f)
                curveTo(12.62f, 8.94f, 12.83f, 8.76f, 13f, 8.54f)
                curveTo(13.14f, 8.33f, 13.22f, 8.08f, 13.22f, 7.8f)
                curveTo(13.22f, 7.5f, 13.13f, 7.28f, 12.95f, 7.11f)
                curveTo(12.77f, 6.93f, 12.5f, 6.85f, 12.19f, 6.85f)
                curveTo(11.92f, 6.85f, 11.7f, 6.92f, 11.5f, 7.06f)
                curveTo(11.34f, 7.2f, 11.24f, 7.41f, 11.24f, 7.69f)
                horizontalLineTo(9.27f)
                curveTo(9.22f, 7f, 9.5f, 6.4f, 10.05f, 6.04f)
                moveTo(11f, 14f)
                verticalLineTo(12f)
                horizontalLineTo(13f)
                verticalLineTo(14f)
                close()
            }
        }.build()

        return _TooltipQuestionOutline!!
    }

@Suppress("ObjectPropertyName")
private var _TooltipQuestionOutline: ImageVector? = null
