package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ViewGalleryOutline: ImageVector
    get() {
        if (_ViewGalleryOutline != null) {
            return _ViewGalleryOutline!!
        }
        _ViewGalleryOutline = ImageVector.Builder(
            name = "ViewGalleryOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 3f)
                verticalLineTo(21f)
                horizontalLineTo(23f)
                verticalLineTo(3f)
                horizontalLineTo(1f)
                moveTo(21f, 5f)
                verticalLineTo(14f)
                horizontalLineTo(3f)
                verticalLineTo(5f)
                horizontalLineTo(21f)
                moveTo(11f, 16f)
                verticalLineTo(19f)
                horizontalLineTo(8f)
                verticalLineTo(16f)
                horizontalLineTo(11f)
                moveTo(3f, 16f)
                horizontalLineTo(6f)
                verticalLineTo(19f)
                horizontalLineTo(3f)
                verticalLineTo(16f)
                moveTo(13f, 19f)
                verticalLineTo(16f)
                horizontalLineTo(16f)
                verticalLineTo(19f)
                horizontalLineTo(13f)
                moveTo(18f, 19f)
                verticalLineTo(16f)
                horizontalLineTo(21f)
                verticalLineTo(19f)
                horizontalLineTo(18f)
                close()
            }
        }.build()

        return _ViewGalleryOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ViewGalleryOutline: ImageVector? = null
