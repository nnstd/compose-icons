package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileLinkOutline: ImageVector
    get() {
        if (_FileLinkOutline != null) {
            return _FileLinkOutline!!
        }
        _FileLinkOutline = ImageVector.Builder(
            name = "FileLinkOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 2f)
                horizontalLineTo(6f)
                curveTo(4.89f, 2f, 4f, 2.9f, 4f, 4f)
                verticalLineTo(20f)
                curveTo(4f, 21.11f, 4.89f, 22f, 6f, 22f)
                horizontalLineTo(18f)
                curveTo(19.11f, 22f, 20f, 21.11f, 20f, 20f)
                verticalLineTo(8f)
                lineTo(14f, 2f)
                moveTo(18f, 20f)
                horizontalLineTo(6f)
                verticalLineTo(4f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(18f)
                verticalLineTo(20f)
                moveTo(11f, 19f)
                horizontalLineTo(10.75f)
                curveTo(9.45f, 19f, 7f, 18.22f, 7f, 15.25f)
                reflectiveCurveTo(9.45f, 11.5f, 10.75f, 11.5f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                horizontalLineTo(10.75f)
                curveTo(10.38f, 13f, 8.5f, 13.13f, 8.5f, 15.25f)
                curveTo(8.5f, 17.44f, 10.5f, 17.5f, 10.75f, 17.5f)
                horizontalLineTo(11f)
                verticalLineTo(19f)
                moveTo(14f, 16f)
                horizontalLineTo(10f)
                verticalLineTo(14.5f)
                horizontalLineTo(14f)
                verticalLineTo(16f)
                moveTo(13f, 11.5f)
                horizontalLineTo(13.25f)
                curveTo(14.55f, 11.5f, 17f, 12.28f, 17f, 15.25f)
                reflectiveCurveTo(14.55f, 19f, 13.25f, 19f)
                horizontalLineTo(13f)
                verticalLineTo(17.5f)
                horizontalLineTo(13.25f)
                curveTo(13.62f, 17.5f, 15.5f, 17.37f, 15.5f, 15.25f)
                curveTo(15.5f, 13.06f, 13.5f, 13f, 13.25f, 13f)
                horizontalLineTo(13f)
                verticalLineTo(11.5f)
                close()
            }
        }.build()

        return _FileLinkOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FileLinkOutline: ImageVector? = null
