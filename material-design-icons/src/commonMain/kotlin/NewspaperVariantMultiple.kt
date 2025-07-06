package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.NewspaperVariantMultiple: ImageVector
    get() {
        if (_NewspaperVariantMultiple != null) {
            return _NewspaperVariantMultiple!!
        }
        _NewspaperVariantMultiple = ImageVector.Builder(
            name = "NewspaperVariantMultiple",
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
                moveTo(21.3f, 3f)
                horizontalLineTo(7.7f)
                curveTo(6.76f, 3f, 6f, 3.7f, 6f, 4.55f)
                verticalLineTo(15.45f)
                curveTo(6f, 16.31f, 6.76f, 17f, 7.7f, 17f)
                horizontalLineTo(21.3f)
                curveTo(22.24f, 17f, 23f, 16.31f, 23f, 15.45f)
                verticalLineTo(4.55f)
                curveTo(23f, 3.7f, 22.24f, 3f, 21.3f, 3f)
                moveTo(8f, 5f)
                horizontalLineTo(13f)
                verticalLineTo(11f)
                horizontalLineTo(8f)
                verticalLineTo(5f)
                moveTo(21f, 15f)
                horizontalLineTo(8f)
                verticalLineTo(13f)
                horizontalLineTo(21f)
                verticalLineTo(15f)
                moveTo(21f, 11f)
                horizontalLineTo(15f)
                verticalLineTo(9f)
                horizontalLineTo(21f)
                verticalLineTo(11f)
                moveTo(21f, 7f)
                horizontalLineTo(15f)
                verticalLineTo(5f)
                horizontalLineTo(21f)
                verticalLineTo(7f)
                close()
            }
        }.build()

        return _NewspaperVariantMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _NewspaperVariantMultiple: ImageVector? = null
