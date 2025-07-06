package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TimelineQuestionOutline: ImageVector
    get() {
        if (_TimelineQuestionOutline != null) {
            return _TimelineQuestionOutline!!
        }
        _TimelineQuestionOutline = ImageVector.Builder(
            name = "TimelineQuestionOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 12f)
                curveTo(5f, 13.11f, 4.11f, 14f, 3f, 14f)
                curveTo(1.9f, 14f, 1f, 13.11f, 1f, 12f)
                curveTo(1f, 10.9f, 1.9f, 10f, 3f, 10f)
                curveTo(4.11f, 10f, 5f, 10.9f, 5f, 12f)
                moveTo(4f, 2f)
                verticalLineTo(8f)
                horizontalLineTo(2f)
                verticalLineTo(2f)
                horizontalLineTo(4f)
                moveTo(2f, 22f)
                verticalLineTo(16f)
                horizontalLineTo(4f)
                verticalLineTo(22f)
                horizontalLineTo(2f)
                moveTo(24f, 6f)
                verticalLineTo(18f)
                curveTo(24f, 19.11f, 23.11f, 20f, 22f, 20f)
                horizontalLineTo(10f)
                curveTo(8.9f, 20f, 8f, 19.11f, 8f, 18f)
                verticalLineTo(14f)
                lineTo(6f, 12f)
                lineTo(8f, 10f)
                verticalLineTo(6f)
                curveTo(8f, 4.89f, 8.9f, 4f, 10f, 4f)
                horizontalLineTo(22f)
                curveTo(23.11f, 4f, 24f, 4.89f, 24f, 6f)
                moveTo(22f, 6f)
                horizontalLineTo(10f)
                verticalLineTo(10.83f)
                lineTo(8.83f, 12f)
                lineTo(10f, 13.17f)
                verticalLineTo(18f)
                horizontalLineTo(22f)
                verticalLineTo(6f)
                moveTo(16.5f, 15.5f)
                verticalLineTo(17f)
                horizontalLineTo(15f)
                verticalLineTo(15.5f)
                horizontalLineTo(16.5f)
                moveTo(14.5f, 10.5f)
                horizontalLineTo(13f)
                verticalLineTo(10f)
                curveTo(13f, 8.34f, 14.34f, 7f, 16f, 7f)
                curveTo(17.66f, 7f, 19f, 8.34f, 19f, 10f)
                curveTo(19f, 10.97f, 18.5f, 11.88f, 17.71f, 12.41f)
                lineTo(17.41f, 12.6f)
                curveTo(16.84f, 13f, 16.5f, 13.62f, 16.5f, 14.3f)
                verticalLineTo(14.5f)
                horizontalLineTo(15f)
                verticalLineTo(14.3f)
                curveTo(15f, 13.11f, 15.6f, 12f, 16.59f, 11.35f)
                lineTo(16.88f, 11.16f)
                curveTo(17.27f, 10.9f, 17.5f, 10.47f, 17.5f, 10f)
                curveTo(17.5f, 9.18f, 16.83f, 8.5f, 16f, 8.5f)
                curveTo(15.17f, 8.5f, 14.5f, 9.17f, 14.5f, 10f)
                verticalLineTo(10.5f)
                close()
            }
        }.build()

        return _TimelineQuestionOutline!!
    }

@Suppress("ObjectPropertyName")
private var _TimelineQuestionOutline: ImageVector? = null
