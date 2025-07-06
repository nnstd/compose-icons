package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AttachmentOff: ImageVector
    get() {
        if (_AttachmentOff != null) {
            return _AttachmentOff!!
        }
        _AttachmentOff = ImageVector.Builder(
            name = "AttachmentOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 10f)
                verticalLineTo(11.5f)
                horizontalLineTo(14.7f)
                lineTo(13.2f, 10f)
                horizontalLineTo(17f)
                moveTo(18f, 8.5f)
                curveTo(19.38f, 8.5f, 20.5f, 9.62f, 20.5f, 11f)
                reflectiveCurveTo(19.38f, 13.5f, 18f, 13.5f)
                horizontalLineTo(16.7f)
                lineTo(18.18f, 15f)
                curveTo(20.31f, 14.89f, 22f, 13.15f, 22f, 11f)
                curveTo(22f, 8.79f, 20.21f, 7f, 18f, 7f)
                horizontalLineTo(10.2f)
                lineTo(11.7f, 8.5f)
                horizontalLineTo(18f)
                moveTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(16.11f, 18f)
                horizontalLineTo(7.5f)
                curveTo(4.46f, 18f, 2f, 15.54f, 2f, 12.5f)
                curveTo(2f, 10.17f, 3.45f, 8.19f, 5.5f, 7.38f)
                lineTo(1.11f, 3f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                moveTo(8.5f, 12.5f)
                curveTo(8.5f, 13.05f, 8.95f, 13.5f, 9.5f, 13.5f)
                horizontalLineTo(11.61f)
                lineTo(9.61f, 11.5f)
                horizontalLineTo(9.5f)
                curveTo(8.95f, 11.5f, 8.5f, 11.95f, 8.5f, 12.5f)
                moveTo(14.61f, 16.5f)
                lineTo(13.11f, 15f)
                horizontalLineTo(9.5f)
                curveTo(8.12f, 15f, 7f, 13.88f, 7f, 12.5f)
                curveTo(7f, 11.5f, 7.57f, 10.69f, 8.38f, 10.27f)
                lineTo(6.69f, 8.58f)
                curveTo(4.87f, 8.96f, 3.5f, 10.57f, 3.5f, 12.5f)
                curveTo(3.5f, 14.71f, 5.29f, 16.5f, 7.5f, 16.5f)
                horizontalLineTo(14.61f)
                close()
            }
        }.build()

        return _AttachmentOff!!
    }

@Suppress("ObjectPropertyName")
private var _AttachmentOff: ImageVector? = null
