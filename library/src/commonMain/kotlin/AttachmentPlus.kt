package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AttachmentPlus: ImageVector
    get() {
        if (_AttachmentPlus != null) {
            return _AttachmentPlus!!
        }
        _AttachmentPlus = ImageVector.Builder(
            name = "AttachmentPlus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.5f, 16.5f)
                horizontalLineTo(13.55f)
                curveTo(13.34f, 16.97f, 13.18f, 17.47f, 13.09f, 18f)
                horizontalLineTo(7.5f)
                curveTo(4.46f, 18f, 2f, 15.54f, 2f, 12.5f)
                reflectiveCurveTo(4.46f, 7f, 7.5f, 7f)
                horizontalLineTo(18f)
                curveTo(20.21f, 7f, 22f, 8.79f, 22f, 11f)
                curveTo(22f, 11.91f, 21.69f, 12.74f, 21.17f, 13.41f)
                curveTo(20.63f, 13.2f, 20.05f, 13.07f, 19.45f, 13.03f)
                curveTo(20.08f, 12.58f, 20.5f, 11.84f, 20.5f, 11f)
                curveTo(20.5f, 9.62f, 19.38f, 8.5f, 18f, 8.5f)
                horizontalLineTo(7.5f)
                curveTo(5.29f, 8.5f, 3.5f, 10.29f, 3.5f, 12.5f)
                reflectiveCurveTo(5.29f, 16.5f, 7.5f, 16.5f)
                moveTo(9.5f, 13.5f)
                curveTo(8.95f, 13.5f, 8.5f, 13.05f, 8.5f, 12.5f)
                reflectiveCurveTo(8.95f, 11.5f, 9.5f, 11.5f)
                horizontalLineTo(17f)
                verticalLineTo(10f)
                horizontalLineTo(9.5f)
                curveTo(8.12f, 10f, 7f, 11.12f, 7f, 12.5f)
                reflectiveCurveTo(8.12f, 15f, 9.5f, 15f)
                horizontalLineTo(14.54f)
                curveTo(15.11f, 14.36f, 15.81f, 13.85f, 16.61f, 13.5f)
                horizontalLineTo(9.5f)
                moveTo(20f, 18f)
                verticalLineTo(15f)
                horizontalLineTo(18f)
                verticalLineTo(18f)
                horizontalLineTo(15f)
                verticalLineTo(20f)
                horizontalLineTo(18f)
                verticalLineTo(23f)
                horizontalLineTo(20f)
                verticalLineTo(20f)
                horizontalLineTo(23f)
                verticalLineTo(18f)
                horizontalLineTo(20f)
                close()
            }
        }.build()

        return _AttachmentPlus!!
    }

@Suppress("ObjectPropertyName")
private var _AttachmentPlus: ImageVector? = null
