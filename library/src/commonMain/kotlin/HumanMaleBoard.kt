package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HumanMaleBoard: ImageVector
    get() {
        if (_HumanMaleBoard != null) {
            return _HumanMaleBoard!!
        }
        _HumanMaleBoard = ImageVector.Builder(
            name = "HumanMaleBoard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 15f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 2f)
                horizontalLineTo(9.46f)
                curveTo(9.81f, 2.61f, 10f, 3.3f, 10f, 4f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                moveTo(15f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(9f)
                verticalLineTo(22f)
                horizontalLineTo(7f)
                verticalLineTo(16f)
                horizontalLineTo(5f)
                verticalLineTo(22f)
                horizontalLineTo(3f)
                verticalLineTo(14f)
                horizontalLineTo(1.5f)
                verticalLineTo(9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, 7f)
                horizontalLineTo(15f)
                moveTo(8f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 4f)
                close()
            }
        }.build()

        return _HumanMaleBoard!!
    }

@Suppress("ObjectPropertyName")
private var _HumanMaleBoard: ImageVector? = null
