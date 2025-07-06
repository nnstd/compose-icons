package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Binoculars: ImageVector
    get() {
        if (_Binoculars != null) {
            return _Binoculars!!
        }
        _Binoculars = ImageVector.Builder(
            name = "Binoculars",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 6f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                verticalLineTo(6f)
                moveTo(9f, 20f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 21f)
                horizontalLineTo(5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 20f)
                verticalLineTo(15f)
                lineTo(6f, 6f)
                horizontalLineTo(10f)
                verticalLineTo(13f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 14f)
                verticalLineTo(20f)
                moveTo(10f, 5f)
                horizontalLineTo(7f)
                verticalLineTo(3f)
                horizontalLineTo(10f)
                verticalLineTo(5f)
                moveTo(15f, 20f)
                verticalLineTo(14f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 13f)
                verticalLineTo(6f)
                horizontalLineTo(18f)
                lineTo(20f, 15f)
                verticalLineTo(20f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 21f)
                horizontalLineTo(16f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 20f)
                moveTo(14f, 5f)
                verticalLineTo(3f)
                horizontalLineTo(17f)
                verticalLineTo(5f)
                horizontalLineTo(14f)
                close()
            }
        }.build()

        return _Binoculars!!
    }

@Suppress("ObjectPropertyName")
private var _Binoculars: ImageVector? = null
