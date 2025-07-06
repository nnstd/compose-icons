package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BeakerOutline: ImageVector
    get() {
        if (_BeakerOutline != null) {
            return _BeakerOutline!!
        }
        _BeakerOutline = ImageVector.Builder(
            name = "BeakerOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 3f)
                horizontalLineTo(21f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 7f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 21f)
                horizontalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 19f)
                verticalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 5f)
                verticalLineTo(3f)
                moveTo(7f, 5f)
                verticalLineTo(7f)
                horizontalLineTo(12f)
                verticalLineTo(8f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                horizontalLineTo(10f)
                verticalLineTo(10f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                horizontalLineTo(10f)
                verticalLineTo(12f)
                horizontalLineTo(7f)
                verticalLineTo(13f)
                horizontalLineTo(12f)
                verticalLineTo(14f)
                horizontalLineTo(7f)
                verticalLineTo(15f)
                horizontalLineTo(10f)
                verticalLineTo(16f)
                horizontalLineTo(7f)
                verticalLineTo(19f)
                horizontalLineTo(17f)
                verticalLineTo(5f)
                horizontalLineTo(7f)
                close()
            }
        }.build()

        return _BeakerOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BeakerOutline: ImageVector? = null
