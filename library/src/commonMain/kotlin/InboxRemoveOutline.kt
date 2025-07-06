package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.InboxRemoveOutline: ImageVector
    get() {
        if (_InboxRemoveOutline != null) {
            return _InboxRemoveOutline!!
        }
        _InboxRemoveOutline = ImageVector.Builder(
            name = "InboxRemoveOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.1f, 3.9f, 21f, 5f, 21f)
                horizontalLineTo(19f)
                curveTo(20.1f, 21f, 21f, 20.1f, 21f, 19f)
                verticalLineTo(5f)
                curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
                moveTo(5f, 19f)
                verticalLineTo(17f)
                horizontalLineTo(8.1f)
                curveTo(8.3f, 17.8f, 8.8f, 18.5f, 9.4f, 19f)
                moveTo(19f, 19f)
                horizontalLineTo(14.6f)
                curveTo(15.2f, 18.5f, 15.7f, 17.8f, 15.9f, 17f)
                horizontalLineTo(19f)
                moveTo(19f, 15f)
                horizontalLineTo(14f)
                verticalLineTo(16f)
                curveTo(14f, 17.1f, 13.1f, 18f, 12f, 18f)
                reflectiveCurveTo(10f, 17.1f, 10f, 16f)
                verticalLineTo(15f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                verticalLineTo(15f)
                moveTo(14.1f, 6.5f)
                lineTo(15.5f, 7.9f)
                lineTo(13.4f, 10f)
                lineTo(15.5f, 12.1f)
                lineTo(14.1f, 13.5f)
                lineTo(12f, 11.4f)
                lineTo(9.9f, 13.5f)
                lineTo(8.5f, 12.1f)
                lineTo(10.6f, 10f)
                lineTo(8.5f, 7.9f)
                lineTo(9.9f, 6.5f)
                lineTo(12f, 8.6f)
                lineTo(14.1f, 6.5f)
                close()
            }
        }.build()

        return _InboxRemoveOutline!!
    }

@Suppress("ObjectPropertyName")
private var _InboxRemoveOutline: ImageVector? = null
