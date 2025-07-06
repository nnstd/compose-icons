package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.NewspaperVariantOutline: ImageVector
    get() {
        if (_NewspaperVariantOutline != null) {
            return _NewspaperVariantOutline!!
        }
        _NewspaperVariantOutline = ImageVector.Builder(
            name = "NewspaperVariantOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 5f)
                lineTo(20f, 19f)
                lineTo(4f, 19f)
                lineTo(4f, 5f)
                horizontalLineTo(20f)
                moveTo(20f, 3f)
                horizontalLineTo(4f)
                curveTo(2.89f, 3f, 2f, 3.89f, 2f, 5f)
                verticalLineTo(19f)
                curveTo(2f, 20.11f, 2.89f, 21f, 4f, 21f)
                horizontalLineTo(20f)
                curveTo(21.11f, 21f, 22f, 20.11f, 22f, 19f)
                verticalLineTo(5f)
                curveTo(22f, 3.89f, 21.11f, 3f, 20f, 3f)
                moveTo(18f, 15f)
                horizontalLineTo(6f)
                verticalLineTo(17f)
                horizontalLineTo(18f)
                verticalLineTo(15f)
                moveTo(10f, 7f)
                horizontalLineTo(6f)
                verticalLineTo(13f)
                horizontalLineTo(10f)
                verticalLineTo(7f)
                moveTo(12f, 9f)
                horizontalLineTo(18f)
                verticalLineTo(7f)
                horizontalLineTo(12f)
                verticalLineTo(9f)
                moveTo(18f, 11f)
                horizontalLineTo(12f)
                verticalLineTo(13f)
                horizontalLineTo(18f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _NewspaperVariantOutline!!
    }

@Suppress("ObjectPropertyName")
private var _NewspaperVariantOutline: ImageVector? = null
