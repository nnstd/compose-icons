package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MicroSd: ImageVector
    get() {
        if (_MicroSd != null) {
            return _MicroSd!!
        }
        _MicroSd = ImageVector.Builder(
            name = "MicroSd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 4f)
                verticalLineTo(11f)
                lineTo(4f, 13f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 22f)
                horizontalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 20f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 2f)
                horizontalLineTo(8f)
                moveTo(9f, 4f)
                horizontalLineTo(11f)
                verticalLineTo(8f)
                horizontalLineTo(9f)
                verticalLineTo(4f)
                moveTo(12f, 4f)
                horizontalLineTo(14f)
                verticalLineTo(8f)
                horizontalLineTo(12f)
                verticalLineTo(4f)
                moveTo(15f, 4f)
                horizontalLineTo(17f)
                verticalLineTo(8f)
                horizontalLineTo(15f)
                verticalLineTo(4f)
                close()
            }
        }.build()

        return _MicroSd!!
    }

@Suppress("ObjectPropertyName")
private var _MicroSd: ImageVector? = null
