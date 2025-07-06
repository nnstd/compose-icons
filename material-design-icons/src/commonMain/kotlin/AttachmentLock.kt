package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AttachmentLock: ImageVector
    get() {
        if (_AttachmentLock != null) {
            return _AttachmentLock!!
        }
        _AttachmentLock = ImageVector.Builder(
            name = "AttachmentLock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 13f)
                curveTo(16.6f, 13f, 15.2f, 14.1f, 15.2f, 15.5f)
                verticalLineTo(17f)
                curveTo(14.6f, 17f, 14f, 17.6f, 14f, 18.2f)
                verticalLineTo(21.7f)
                curveTo(14f, 22.4f, 14.6f, 23f, 15.2f, 23f)
                horizontalLineTo(20.7f)
                curveTo(21.4f, 23f, 22f, 22.4f, 22f, 21.8f)
                verticalLineTo(18.3f)
                curveTo(22f, 17.6f, 21.4f, 17f, 20.8f, 17f)
                verticalLineTo(15.5f)
                curveTo(20.8f, 14.1f, 19.4f, 13f, 18f, 13f)
                moveTo(18f, 14.2f)
                curveTo(18.8f, 14.2f, 19.5f, 14.7f, 19.5f, 15.5f)
                verticalLineTo(17f)
                horizontalLineTo(16.5f)
                verticalLineTo(15.5f)
                curveTo(16.5f, 14.7f, 17.2f, 14.2f, 18f, 14.2f)
                moveTo(7.5f, 5f)
                curveTo(4.5f, 5f, 2f, 7.5f, 2f, 10.5f)
                reflectiveCurveTo(4.5f, 16f, 7.5f, 16f)
                horizontalLineTo(13.2f)
                verticalLineTo(15.5f)
                curveTo(13.2f, 15.2f, 13.2f, 14.8f, 13.3f, 14.5f)
                horizontalLineTo(7.5f)
                curveTo(5.3f, 14.5f, 3.5f, 12.7f, 3.5f, 10.5f)
                reflectiveCurveTo(5.3f, 6.5f, 7.5f, 6.5f)
                horizontalLineTo(18f)
                curveTo(19.4f, 6.5f, 20.5f, 7.6f, 20.5f, 9f)
                curveTo(20.5f, 9.9f, 20f, 10.7f, 19.2f, 11.2f)
                curveTo(19.8f, 11.3f, 20.3f, 11.6f, 20.8f, 11.9f)
                curveTo(21.6f, 11.1f, 22f, 10.1f, 22f, 9f)
                curveTo(22f, 6.8f, 20.2f, 5f, 18f, 5f)
                horizontalLineTo(7.5f)
                moveTo(9.5f, 8f)
                curveTo(8.1f, 8f, 7f, 9.1f, 7f, 10.5f)
                reflectiveCurveTo(8.1f, 13f, 9.5f, 13f)
                horizontalLineTo(14f)
                curveTo(14.5f, 12.3f, 15.1f, 11.8f, 15.8f, 11.5f)
                horizontalLineTo(9.5f)
                curveTo(8.9f, 11.5f, 8.5f, 11.1f, 8.5f, 10.5f)
                reflectiveCurveTo(8.9f, 9.5f, 9.5f, 9.5f)
                horizontalLineTo(17f)
                verticalLineTo(8f)
                horizontalLineTo(9.5f)
                close()
            }
        }.build()

        return _AttachmentLock!!
    }

@Suppress("ObjectPropertyName")
private var _AttachmentLock: ImageVector? = null
