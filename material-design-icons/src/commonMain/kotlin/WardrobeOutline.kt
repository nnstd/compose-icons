package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WardrobeOutline: ImageVector
    get() {
        if (_WardrobeOutline != null) {
            return _WardrobeOutline!!
        }
        _WardrobeOutline = ImageVector.Builder(
            name = "WardrobeOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 2f)
                curveTo(4.89f, 2f, 4f, 2.9f, 4f, 4f)
                verticalLineTo(19f)
                curveTo(4f, 20.11f, 4.89f, 21f, 6f, 21f)
                verticalLineTo(22f)
                horizontalLineTo(8f)
                verticalLineTo(21f)
                horizontalLineTo(16f)
                verticalLineTo(22f)
                horizontalLineTo(18f)
                verticalLineTo(21f)
                curveTo(19.11f, 21f, 20f, 20.11f, 20f, 19f)
                verticalLineTo(4f)
                curveTo(20f, 2.9f, 19.11f, 2f, 18f, 2f)
                horizontalLineTo(6f)
                moveTo(6f, 4f)
                horizontalLineTo(11f)
                verticalLineTo(19f)
                horizontalLineTo(6f)
                verticalLineTo(4f)
                moveTo(13f, 4f)
                horizontalLineTo(18f)
                verticalLineTo(19f)
                horizontalLineTo(13f)
                verticalLineTo(4f)
                moveTo(8f, 10f)
                verticalLineTo(13f)
                horizontalLineTo(10f)
                verticalLineTo(10f)
                horizontalLineTo(8f)
                moveTo(14f, 10f)
                verticalLineTo(13f)
                horizontalLineTo(16f)
                verticalLineTo(10f)
                horizontalLineTo(14f)
                close()
            }
        }.build()

        return _WardrobeOutline!!
    }

@Suppress("ObjectPropertyName")
private var _WardrobeOutline: ImageVector? = null
