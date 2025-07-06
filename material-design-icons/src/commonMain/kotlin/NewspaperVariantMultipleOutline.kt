package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.NewspaperVariantMultipleOutline: ImageVector
    get() {
        if (_NewspaperVariantMultipleOutline != null) {
            return _NewspaperVariantMultipleOutline!!
        }
        _NewspaperVariantMultipleOutline = ImageVector.Builder(
            name = "NewspaperVariantMultipleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 7f)
                verticalLineTo(19f)
                horizontalLineTo(19f)
                verticalLineTo(21f)
                horizontalLineTo(4f)
                curveTo(2f, 21f, 2f, 19f, 2f, 19f)
                verticalLineTo(7f)
                horizontalLineTo(4f)
                moveTo(21f, 5f)
                verticalLineTo(15f)
                horizontalLineTo(8f)
                verticalLineTo(5f)
                horizontalLineTo(21f)
                moveTo(21.3f, 3f)
                horizontalLineTo(7.7f)
                curveTo(6.76f, 3f, 6f, 3.7f, 6f, 4.55f)
                verticalLineTo(15.45f)
                curveTo(6f, 16.31f, 6.76f, 17f, 7.7f, 17f)
                horizontalLineTo(21.3f)
                curveTo(22.24f, 17f, 23f, 16.31f, 23f, 15.45f)
                verticalLineTo(4.55f)
                curveTo(23f, 3.7f, 22.24f, 3f, 21.3f, 3f)
                moveTo(9f, 6f)
                horizontalLineTo(12f)
                verticalLineTo(11f)
                horizontalLineTo(9f)
                verticalLineTo(6f)
                moveTo(20f, 14f)
                horizontalLineTo(9f)
                verticalLineTo(12f)
                horizontalLineTo(20f)
                verticalLineTo(14f)
                moveTo(20f, 8f)
                horizontalLineTo(14f)
                verticalLineTo(6f)
                horizontalLineTo(20f)
                verticalLineTo(8f)
                moveTo(20f, 11f)
                horizontalLineTo(14f)
                verticalLineTo(9f)
                horizontalLineTo(20f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _NewspaperVariantMultipleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _NewspaperVariantMultipleOutline: ImageVector? = null
