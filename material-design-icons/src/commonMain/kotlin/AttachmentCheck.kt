package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AttachmentCheck: ImageVector
    get() {
        if (_AttachmentCheck != null) {
            return _AttachmentCheck!!
        }
        _AttachmentCheck = ImageVector.Builder(
            name = "AttachmentCheck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.61f, 13.5f)
                curveTo(15.81f, 13.85f, 15.11f, 14.36f, 14.54f, 15f)
                horizontalLineTo(9.5f)
                curveTo(8.12f, 15f, 7f, 13.88f, 7f, 12.5f)
                reflectiveCurveTo(8.12f, 10f, 9.5f, 10f)
                horizontalLineTo(17f)
                verticalLineTo(11.5f)
                horizontalLineTo(9.5f)
                curveTo(8.95f, 11.5f, 8.5f, 11.95f, 8.5f, 12.5f)
                reflectiveCurveTo(8.95f, 13.5f, 9.5f, 13.5f)
                horizontalLineTo(16.61f)
                moveTo(3.5f, 12.5f)
                curveTo(3.5f, 10.29f, 5.29f, 8.5f, 7.5f, 8.5f)
                horizontalLineTo(18f)
                curveTo(19.38f, 8.5f, 20.5f, 9.62f, 20.5f, 11f)
                curveTo(20.5f, 11.84f, 20.08f, 12.58f, 19.45f, 13.03f)
                curveTo(20.05f, 13.07f, 20.63f, 13.2f, 21.17f, 13.41f)
                curveTo(21.69f, 12.74f, 22f, 11.91f, 22f, 11f)
                curveTo(22f, 8.79f, 20.21f, 7f, 18f, 7f)
                horizontalLineTo(7.5f)
                curveTo(4.46f, 7f, 2f, 9.46f, 2f, 12.5f)
                reflectiveCurveTo(4.46f, 18f, 7.5f, 18f)
                horizontalLineTo(13.09f)
                curveTo(13.18f, 17.47f, 13.34f, 16.97f, 13.55f, 16.5f)
                horizontalLineTo(7.5f)
                curveTo(5.29f, 16.5f, 3.5f, 14.71f, 3.5f, 12.5f)
                moveTo(21.34f, 15.84f)
                lineTo(17.75f, 19.43f)
                lineTo(16.16f, 17.84f)
                lineTo(15f, 19f)
                lineTo(17.75f, 22f)
                lineTo(22.5f, 17.25f)
                lineTo(21.34f, 15.84f)
                close()
            }
        }.build()

        return _AttachmentCheck!!
    }

@Suppress("ObjectPropertyName")
private var _AttachmentCheck: ImageVector? = null
