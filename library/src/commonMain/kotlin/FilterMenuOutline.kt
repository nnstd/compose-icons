package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FilterMenuOutline: ImageVector
    get() {
        if (_FilterMenuOutline != null) {
            return _FilterMenuOutline!!
        }
        _FilterMenuOutline = ImageVector.Builder(
            name = "FilterMenuOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 18.88f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.71f, 19.71f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.3f, 19.71f)
                lineTo(6.3f, 15.71f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 14.87f)
                verticalLineTo(9.75f)
                lineTo(1.21f, 3.62f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.38f, 2.22f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 2f)
                horizontalLineTo(16f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.62f, 2.22f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.79f, 3.62f)
                lineTo(12f, 9.75f)
                verticalLineTo(18.88f)
                moveTo(4f, 4f)
                lineTo(8f, 9.06f)
                verticalLineTo(14.58f)
                lineTo(10f, 16.58f)
                verticalLineTo(9.05f)
                lineTo(14f, 4f)
                moveTo(13f, 16f)
                lineTo(18f, 21f)
                lineTo(23f, 16f)
                close()
            }
        }.build()

        return _FilterMenuOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FilterMenuOutline: ImageVector? = null
