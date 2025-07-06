package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.VectorSquarePlus: ImageVector
    get() {
        if (_VectorSquarePlus != null) {
            return _VectorSquarePlus!!
        }
        _VectorSquarePlus = ImageVector.Builder(
            name = "VectorSquarePlus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 19f)
                curveTo(13f, 18.7f, 13f, 18.3f, 13.1f, 18f)
                horizontalLineTo(8f)
                verticalLineTo(16f)
                horizontalLineTo(6f)
                verticalLineTo(8f)
                horizontalLineTo(8f)
                verticalLineTo(6f)
                horizontalLineTo(16f)
                verticalLineTo(8f)
                horizontalLineTo(18f)
                verticalLineTo(13.1f)
                curveTo(18.3f, 13f, 18.7f, 13f, 19f, 13f)
                curveTo(19.3f, 13f, 19.7f, 13f, 20f, 13.1f)
                verticalLineTo(8f)
                horizontalLineTo(22f)
                verticalLineTo(2f)
                horizontalLineTo(16f)
                verticalLineTo(4f)
                horizontalLineTo(8f)
                verticalLineTo(2f)
                horizontalLineTo(2f)
                verticalLineTo(8f)
                horizontalLineTo(4f)
                verticalLineTo(16f)
                horizontalLineTo(2f)
                verticalLineTo(22f)
                horizontalLineTo(8f)
                verticalLineTo(20f)
                horizontalLineTo(13.1f)
                curveTo(13f, 19.7f, 13f, 19.3f, 13f, 19f)
                moveTo(18f, 4f)
                horizontalLineTo(20f)
                verticalLineTo(6f)
                horizontalLineTo(18f)
                verticalLineTo(4f)
                moveTo(4f, 4f)
                horizontalLineTo(6f)
                verticalLineTo(6f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                moveTo(6f, 20f)
                horizontalLineTo(4f)
                verticalLineTo(18f)
                horizontalLineTo(6f)
                verticalLineTo(20f)
                moveTo(20f, 15f)
                verticalLineTo(18f)
                horizontalLineTo(23f)
                verticalLineTo(20f)
                horizontalLineTo(20f)
                verticalLineTo(23f)
                horizontalLineTo(18f)
                verticalLineTo(20f)
                horizontalLineTo(15f)
                verticalLineTo(18f)
                horizontalLineTo(18f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                close()
            }
        }.build()

        return _VectorSquarePlus!!
    }

@Suppress("ObjectPropertyName")
private var _VectorSquarePlus: ImageVector? = null
