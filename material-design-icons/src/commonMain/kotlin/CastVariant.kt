package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CastVariant: ImageVector
    get() {
        if (_CastVariant != null) {
            return _CastVariant!!
        }
        _CastVariant = ImageVector.Builder(
            name = "CastVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 22f)
                horizontalLineTo(18f)
                lineTo(12f, 16f)
                moveTo(21f, 3f)
                horizontalLineTo(3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 5f)
                verticalLineTo(17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 19f)
                horizontalLineTo(7f)
                verticalLineTo(17f)
                horizontalLineTo(3f)
                verticalLineTo(5f)
                horizontalLineTo(21f)
                verticalLineTo(17f)
                horizontalLineTo(17f)
                verticalLineTo(19f)
                horizontalLineTo(21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 17f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 3f)
                close()
            }
        }.build()

        return _CastVariant!!
    }

@Suppress("ObjectPropertyName")
private var _CastVariant: ImageVector? = null
