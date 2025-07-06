package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HumanMaleHeightVariant: ImageVector
    get() {
        if (_HumanMaleHeightVariant != null) {
            return _HumanMaleHeightVariant!!
        }
        _HumanMaleHeightVariant = ImageVector.Builder(
            name = "HumanMaleHeightVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 2f)
                curveTo(8.78f, 2f, 9.67f, 4.16f, 8.42f, 5.42f)
                curveTo(7.16f, 6.67f, 5f, 5.78f, 5f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 2f)
                moveTo(5.5f, 7f)
                horizontalLineTo(8.5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.5f, 9f)
                verticalLineTo(14.5f)
                horizontalLineTo(9f)
                verticalLineTo(22f)
                horizontalLineTo(5f)
                verticalLineTo(14.5f)
                horizontalLineTo(3.5f)
                verticalLineTo(9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, 7f)
                moveTo(19f, 8f)
                horizontalLineTo(21f)
                lineTo(18f, 4f)
                lineTo(15f, 8f)
                horizontalLineTo(17f)
                verticalLineTo(16f)
                horizontalLineTo(15f)
                lineTo(18f, 20f)
                lineTo(21f, 16f)
                horizontalLineTo(19f)
                moveTo(22f, 2f)
                horizontalLineTo(14f)
                verticalLineTo(4f)
                horizontalLineTo(22f)
                moveTo(22f, 20f)
                horizontalLineTo(14f)
                verticalLineTo(22f)
                horizontalLineTo(22f)
            }
        }.build()

        return _HumanMaleHeightVariant!!
    }

@Suppress("ObjectPropertyName")
private var _HumanMaleHeightVariant: ImageVector? = null
