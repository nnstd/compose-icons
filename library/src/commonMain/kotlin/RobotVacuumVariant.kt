package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RobotVacuumVariant: ImageVector
    get() {
        if (_RobotVacuumVariant != null) {
            return _RobotVacuumVariant!!
        }
        _RobotVacuumVariant = ImageVector.Builder(
            name = "RobotVacuumVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 5f)
                verticalLineTo(7f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                verticalLineTo(7f)
                horizontalLineTo(21f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 3f)
                horizontalLineTo(5f)
                moveTo(8f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(16f)
                verticalLineTo(7f)
                horizontalLineTo(8f)
                moveTo(3f, 9f)
                verticalLineTo(12f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 21f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 12f)
                verticalLineTo(9f)
                horizontalLineTo(19f)
                verticalLineTo(12f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 19f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 12f)
                verticalLineTo(9f)
                horizontalLineTo(3f)
                moveTo(12f, 12f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.5f, 14.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 17f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.5f, 14.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 12f)
                close()
            }
        }.build()

        return _RobotVacuumVariant!!
    }

@Suppress("ObjectPropertyName")
private var _RobotVacuumVariant: ImageVector? = null
