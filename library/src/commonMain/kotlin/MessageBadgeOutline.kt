package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MessageBadgeOutline: ImageVector
    get() {
        if (_MessageBadgeOutline != null) {
            return _MessageBadgeOutline!!
        }
        _MessageBadgeOutline = ImageVector.Builder(
            name = "MessageBadgeOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 7f)
                verticalLineTo(16f)
                curveTo(22f, 17.1f, 21.1f, 18f, 20f, 18f)
                horizontalLineTo(6f)
                lineTo(2f, 22f)
                verticalLineTo(4f)
                curveTo(2f, 2.9f, 2.9f, 2f, 4f, 2f)
                horizontalLineTo(14.1f)
                curveTo(14f, 2.3f, 14f, 2.7f, 14f, 3f)
                reflectiveCurveTo(14f, 3.7f, 14.1f, 4f)
                horizontalLineTo(4f)
                verticalLineTo(16f)
                horizontalLineTo(20f)
                verticalLineTo(7.9f)
                curveTo(20.7f, 7.8f, 21.4f, 7.4f, 22f, 7f)
                moveTo(16f, 3f)
                curveTo(16f, 4.7f, 17.3f, 6f, 19f, 6f)
                reflectiveCurveTo(22f, 4.7f, 22f, 3f)
                reflectiveCurveTo(20.7f, 0f, 19f, 0f)
                reflectiveCurveTo(16f, 1.3f, 16f, 3f)
                close()
            }
        }.build()

        return _MessageBadgeOutline!!
    }

@Suppress("ObjectPropertyName")
private var _MessageBadgeOutline: ImageVector? = null
