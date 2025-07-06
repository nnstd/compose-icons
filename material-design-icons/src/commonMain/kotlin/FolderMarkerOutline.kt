package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FolderMarkerOutline: ImageVector
    get() {
        if (_FolderMarkerOutline != null) {
            return _FolderMarkerOutline!!
        }
        _FolderMarkerOutline = ImageVector.Builder(
            name = "FolderMarkerOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.5f, 12f)
                curveTo(20.4f, 12f, 22f, 13.6f, 22f, 15.5f)
                curveTo(22f, 18.1f, 18.5f, 22f, 18.5f, 22f)
                curveTo(18.5f, 22f, 15f, 18.1f, 15f, 15.5f)
                curveTo(15f, 13.6f, 16.6f, 12f, 18.5f, 12f)
                moveTo(18.5f, 16.8f)
                curveTo(19.2f, 16.8f, 19.8f, 16.2f, 19.7f, 15.6f)
                curveTo(19.7f, 15f, 19.1f, 14.4f, 18.5f, 14.4f)
                curveTo(17.9f, 14.4f, 17.3f, 14.9f, 17.3f, 15.6f)
                curveTo(17.3f, 16.2f, 17.8f, 16.8f, 18.5f, 16.8f)
                moveTo(20f, 8f)
                horizontalLineTo(4f)
                verticalLineTo(18f)
                horizontalLineTo(13.5f)
                curveTo(13.79f, 18.68f, 14.13f, 19.35f, 14.5f, 20f)
                horizontalLineTo(4f)
                curveTo(2.89f, 20f, 2f, 19.1f, 2f, 18f)
                lineTo(2f, 6f)
                curveTo(2f, 4.89f, 2.89f, 4f, 4f, 4f)
                horizontalLineTo(10f)
                lineTo(12f, 6f)
                horizontalLineTo(20f)
                curveTo(21.1f, 6f, 22f, 6.89f, 22f, 8f)
                verticalLineTo(11.34f)
                curveTo(21.42f, 10.84f, 20.74f, 10.45f, 20f, 10.23f)
                verticalLineTo(8f)
                close()
            }
        }.build()

        return _FolderMarkerOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FolderMarkerOutline: ImageVector? = null
