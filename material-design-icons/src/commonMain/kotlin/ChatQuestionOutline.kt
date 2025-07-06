package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ChatQuestionOutline: ImageVector
    get() {
        if (_ChatQuestionOutline != null) {
            return _ChatQuestionOutline!!
        }
        _ChatQuestionOutline = ImageVector.Builder(
            name = "ChatQuestionOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 3f)
                curveTo(6.5f, 3f, 2f, 6.6f, 2f, 11f)
                curveTo(2f, 13.2f, 3.1f, 15.2f, 4.8f, 16.5f)
                curveTo(4.8f, 17.1f, 4.4f, 18.7f, 2f, 21f)
                curveTo(4.4f, 20.9f, 6.6f, 20f, 8.5f, 18.5f)
                curveTo(9.6f, 18.8f, 10.8f, 19f, 12f, 19f)
                curveTo(17.5f, 19f, 22f, 15.4f, 22f, 11f)
                reflectiveCurveTo(17.5f, 3f, 12f, 3f)
                moveTo(12f, 17f)
                curveTo(7.6f, 17f, 4f, 14.3f, 4f, 11f)
                reflectiveCurveTo(7.6f, 5f, 12f, 5f)
                reflectiveCurveTo(20f, 7.7f, 20f, 11f)
                reflectiveCurveTo(16.4f, 17f, 12f, 17f)
                moveTo(12.2f, 6.5f)
                curveTo(11.3f, 6.5f, 10.6f, 6.7f, 10.1f, 7f)
                curveTo(9.5f, 7.4f, 9.2f, 8f, 9.3f, 8.7f)
                horizontalLineTo(11.3f)
                curveTo(11.3f, 8.4f, 11.4f, 8.2f, 11.6f, 8.1f)
                curveTo(11.8f, 8f, 12f, 7.9f, 12.3f, 7.9f)
                curveTo(12.6f, 7.9f, 12.9f, 8f, 13.1f, 8.2f)
                curveTo(13.3f, 8.4f, 13.4f, 8.6f, 13.4f, 8.9f)
                curveTo(13.4f, 9.2f, 13.3f, 9.4f, 13.2f, 9.6f)
                curveTo(13f, 9.8f, 12.8f, 10f, 12.6f, 10.1f)
                curveTo(12.1f, 10.4f, 11.7f, 10.7f, 11.5f, 10.9f)
                curveTo(11.1f, 11.2f, 11f, 11.5f, 11f, 12f)
                horizontalLineTo(13f)
                curveTo(13f, 11.7f, 13.1f, 11.5f, 13.1f, 11.3f)
                curveTo(13.2f, 11.1f, 13.4f, 11f, 13.6f, 10.8f)
                curveTo(14.1f, 10.6f, 14.4f, 10.3f, 14.7f, 9.9f)
                curveTo(15f, 9.5f, 15.1f, 9.1f, 15.1f, 8.7f)
                curveTo(15.1f, 8f, 14.8f, 7.4f, 14.3f, 7f)
                curveTo(13.9f, 6.7f, 13.1f, 6.5f, 12.2f, 6.5f)
                moveTo(11f, 13f)
                verticalLineTo(15f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                close()
            }
        }.build()

        return _ChatQuestionOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ChatQuestionOutline: ImageVector? = null
