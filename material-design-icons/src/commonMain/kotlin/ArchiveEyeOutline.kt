package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArchiveEyeOutline: ImageVector
    get() {
        if (_ArchiveEyeOutline != null) {
            return _ArchiveEyeOutline!!
        }
        _ArchiveEyeOutline = ImageVector.Builder(
            name = "ArchiveEyeOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.5f, 11f)
                curveTo(14.78f, 11f, 15f, 11.22f, 15f, 11.5f)
                verticalLineTo(13f)
                horizontalLineTo(9f)
                verticalLineTo(11.5f)
                curveTo(9f, 11.22f, 9.22f, 11f, 9.5f, 11f)
                horizontalLineTo(14.5f)
                moveTo(20f, 13.55f)
                verticalLineTo(10f)
                horizontalLineTo(18f)
                verticalLineTo(13.06f)
                curveTo(18.69f, 13.14f, 19.36f, 13.31f, 20f, 13.55f)
                moveTo(21f, 9f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                horizontalLineTo(21f)
                verticalLineTo(9f)
                moveTo(19f, 5f)
                horizontalLineTo(5f)
                verticalLineTo(7f)
                horizontalLineTo(19f)
                verticalLineTo(5f)
                moveTo(8.85f, 19f)
                horizontalLineTo(6f)
                verticalLineTo(10f)
                horizontalLineTo(4f)
                verticalLineTo(21f)
                horizontalLineTo(9.78f)
                curveTo(9.54f, 20.61f, 9.32f, 20.19f, 9.14f, 19.75f)
                lineTo(8.85f, 19f)
                moveTo(17f, 18f)
                curveTo(16.44f, 18f, 16f, 18.44f, 16f, 19f)
                reflectiveCurveTo(16.44f, 20f, 17f, 20f)
                reflectiveCurveTo(18f, 19.56f, 18f, 19f)
                reflectiveCurveTo(17.56f, 18f, 17f, 18f)
                moveTo(23f, 19f)
                curveTo(22.06f, 21.34f, 19.73f, 23f, 17f, 23f)
                reflectiveCurveTo(11.94f, 21.34f, 11f, 19f)
                curveTo(11.94f, 16.66f, 14.27f, 15f, 17f, 15f)
                reflectiveCurveTo(22.06f, 16.66f, 23f, 19f)
                moveTo(19.5f, 19f)
                curveTo(19.5f, 17.62f, 18.38f, 16.5f, 17f, 16.5f)
                reflectiveCurveTo(14.5f, 17.62f, 14.5f, 19f)
                reflectiveCurveTo(15.62f, 21.5f, 17f, 21.5f)
                reflectiveCurveTo(19.5f, 20.38f, 19.5f, 19f)
                close()
            }
        }.build()

        return _ArchiveEyeOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ArchiveEyeOutline: ImageVector? = null
