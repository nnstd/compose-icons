package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MessageQuestionOutline: ImageVector
    get() {
        if (_MessageQuestionOutline != null) {
            return _MessageQuestionOutline!!
        }
        _MessageQuestionOutline = ImageVector.Builder(
            name = "MessageQuestionOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 2f)
                horizontalLineTo(4f)
                curveTo(2.9f, 2f, 2f, 2.9f, 2f, 4f)
                verticalLineTo(22f)
                lineTo(6f, 18f)
                horizontalLineTo(20f)
                curveTo(21.1f, 18f, 22f, 17.1f, 22f, 16f)
                verticalLineTo(4f)
                curveTo(22f, 2.9f, 21.1f, 2f, 20f, 2f)
                moveTo(20f, 16f)
                horizontalLineTo(5.2f)
                lineTo(4f, 17.2f)
                verticalLineTo(4f)
                horizontalLineTo(20f)
                verticalLineTo(16f)
                moveTo(12.2f, 5.5f)
                curveTo(11.3f, 5.5f, 10.6f, 5.7f, 10.1f, 6f)
                curveTo(9.5f, 6.4f, 9.2f, 7f, 9.3f, 7.7f)
                horizontalLineTo(11.3f)
                curveTo(11.3f, 7.4f, 11.4f, 7.2f, 11.6f, 7.1f)
                curveTo(11.8f, 7f, 12f, 6.9f, 12.3f, 6.9f)
                curveTo(12.6f, 6.9f, 12.9f, 7f, 13.1f, 7.2f)
                curveTo(13.3f, 7.4f, 13.4f, 7.6f, 13.4f, 7.9f)
                curveTo(13.4f, 8.2f, 13.3f, 8.4f, 13.2f, 8.6f)
                curveTo(13f, 8.8f, 12.8f, 9f, 12.6f, 9.1f)
                curveTo(12.1f, 9.4f, 11.7f, 9.7f, 11.5f, 9.9f)
                curveTo(11.1f, 10.2f, 11f, 10.5f, 11f, 11f)
                horizontalLineTo(13f)
                curveTo(13f, 10.7f, 13.1f, 10.5f, 13.1f, 10.3f)
                curveTo(13.2f, 10.1f, 13.4f, 10f, 13.6f, 9.8f)
                curveTo(14.1f, 9.6f, 14.4f, 9.3f, 14.7f, 8.9f)
                curveTo(15f, 8.5f, 15.1f, 8.1f, 15.1f, 7.7f)
                curveTo(15.1f, 7f, 14.8f, 6.4f, 14.3f, 6f)
                curveTo(13.9f, 5.7f, 13.1f, 5.5f, 12.2f, 5.5f)
                moveTo(11f, 12f)
                verticalLineTo(14f)
                horizontalLineTo(13f)
                verticalLineTo(12f)
                horizontalLineTo(11f)
                close()
            }
        }.build()

        return _MessageQuestionOutline!!
    }

@Suppress("ObjectPropertyName")
private var _MessageQuestionOutline: ImageVector? = null
