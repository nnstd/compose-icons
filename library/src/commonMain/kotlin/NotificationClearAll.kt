package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.NotificationClearAll: ImageVector
    get() {
        if (_NotificationClearAll != null) {
            return _NotificationClearAll!!
        }
        _NotificationClearAll = ImageVector.Builder(
            name = "NotificationClearAll",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 13f)
                horizontalLineTo(19f)
                verticalLineTo(11f)
                horizontalLineTo(5f)
                moveTo(3f, 17f)
                horizontalLineTo(17f)
                verticalLineTo(15f)
                horizontalLineTo(3f)
                moveTo(7f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(21f)
                verticalLineTo(7f)
            }
        }.build()

        return _NotificationClearAll!!
    }

@Suppress("ObjectPropertyName")
private var _NotificationClearAll: ImageVector? = null
