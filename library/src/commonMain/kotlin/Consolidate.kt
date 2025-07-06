package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Consolidate: ImageVector
    get() {
        if (_Consolidate != null) {
            return _Consolidate!!
        }
        _Consolidate = ImageVector.Builder(
            name = "Consolidate",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 9f)
                horizontalLineTo(20f)
                verticalLineTo(4f)
                horizontalLineTo(22f)
                verticalLineTo(9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 11f)
                horizontalLineTo(18f)
                verticalLineTo(13f)
                lineTo(15f, 10f)
                lineTo(18f, 7f)
                moveTo(14f, 10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12f, 12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 10f)
                moveTo(2f, 11f)
                verticalLineTo(16f)
                horizontalLineTo(4f)
                verticalLineTo(11f)
                horizontalLineTo(6f)
                verticalLineTo(13f)
                lineTo(9f, 10f)
                lineTo(6f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 11f)
                moveTo(15f, 16f)
                lineTo(12f, 13f)
                lineTo(9f, 16f)
                horizontalLineTo(11f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 20f)
                horizontalLineTo(18f)
                verticalLineTo(18f)
                horizontalLineTo(13f)
                verticalLineTo(16f)
            }
        }.build()

        return _Consolidate!!
    }

@Suppress("ObjectPropertyName")
private var _Consolidate: ImageVector? = null
