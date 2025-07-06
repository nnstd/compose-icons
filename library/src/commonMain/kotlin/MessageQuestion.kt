package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MessageQuestion: ImageVector
    get() {
        if (_MessageQuestion != null) {
            return _MessageQuestion!!
        }
        _MessageQuestion = ImageVector.Builder(
            name = "MessageQuestion",
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
                moveTo(13f, 14f)
                horizontalLineTo(11f)
                verticalLineTo(12f)
                horizontalLineTo(13f)
                verticalLineTo(14f)
                moveTo(14.8f, 9f)
                curveTo(14.5f, 9.4f, 14.1f, 9.6f, 13.7f, 9.8f)
                curveTo(13.4f, 10f, 13.3f, 10.1f, 13.2f, 10.3f)
                curveTo(13f, 10.5f, 13f, 10.7f, 13f, 11f)
                horizontalLineTo(11f)
                curveTo(11f, 10.5f, 11.1f, 10.2f, 11.3f, 9.9f)
                curveTo(11.5f, 9.7f, 11.9f, 9.4f, 12.4f, 9.1f)
                curveTo(12.7f, 9f, 12.9f, 8.8f, 13f, 8.6f)
                curveTo(13.1f, 8.4f, 13.2f, 8.1f, 13.2f, 7.9f)
                curveTo(13.2f, 7.6f, 13.1f, 7.4f, 12.9f, 7.2f)
                curveTo(12.7f, 7f, 12.4f, 6.9f, 12.1f, 6.9f)
                curveTo(11.8f, 6.9f, 11.6f, 7f, 11.4f, 7.1f)
                curveTo(11.2f, 7.2f, 11.1f, 7.4f, 11.1f, 7.7f)
                horizontalLineTo(9.1f)
                curveTo(9.2f, 7f, 9.5f, 6.4f, 10f, 6f)
                curveTo(10.5f, 5.6f, 11.2f, 5.5f, 12.1f, 5.5f)
                curveTo(13f, 5.5f, 13.8f, 5.7f, 14.3f, 6.1f)
                curveTo(14.8f, 6.5f, 15.1f, 7.1f, 15.1f, 7.8f)
                curveTo(15.2f, 8.2f, 15.1f, 8.6f, 14.8f, 9f)
                close()
            }
        }.build()

        return _MessageQuestion!!
    }

@Suppress("ObjectPropertyName")
private var _MessageQuestion: ImageVector? = null
