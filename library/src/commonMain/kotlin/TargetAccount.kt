package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TargetAccount: ImageVector
    get() {
        if (_TargetAccount != null) {
            return _TargetAccount!!
        }
        _TargetAccount = ImageVector.Builder(
            name = "TargetAccount",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.95f, 11f)
                horizontalLineTo(22.5f)
                verticalLineTo(13f)
                horizontalLineTo(20.95f)
                curveTo(20.5f, 17.17f, 17.17f, 20.5f, 13f, 20.95f)
                verticalLineTo(22.5f)
                horizontalLineTo(11f)
                verticalLineTo(20.95f)
                curveTo(6.83f, 20.5f, 3.5f, 17.17f, 3.05f, 13f)
                horizontalLineTo(1.5f)
                verticalLineTo(11f)
                horizontalLineTo(3.05f)
                curveTo(3.5f, 6.83f, 6.83f, 3.5f, 11f, 3.05f)
                verticalLineTo(1.5f)
                horizontalLineTo(13f)
                verticalLineTo(3.05f)
                curveTo(17.17f, 3.5f, 20.5f, 6.83f, 20.95f, 11f)
                moveTo(5.07f, 11f)
                horizontalLineTo(6.5f)
                verticalLineTo(13f)
                horizontalLineTo(5.07f)
                curveTo(5.5f, 16.07f, 7.93f, 18.5f, 11f, 18.93f)
                verticalLineTo(17.5f)
                horizontalLineTo(13f)
                verticalLineTo(18.93f)
                curveTo(16.07f, 18.5f, 18.5f, 16.07f, 18.93f, 13f)
                horizontalLineTo(17.5f)
                verticalLineTo(11f)
                horizontalLineTo(18.93f)
                curveTo(18.5f, 7.93f, 16.07f, 5.5f, 13f, 5.07f)
                verticalLineTo(6.5f)
                horizontalLineTo(11f)
                verticalLineTo(5.07f)
                curveTo(7.93f, 5.5f, 5.5f, 7.93f, 5.07f, 11f)
                moveTo(16f, 16f)
                horizontalLineTo(8f)
                verticalLineTo(15f)
                curveTo(8f, 13.67f, 10.67f, 13f, 12f, 13f)
                curveTo(13.33f, 13f, 16f, 13.67f, 16f, 15f)
                verticalLineTo(16f)
                moveTo(12f, 8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 8f)
                close()
            }
        }.build()

        return _TargetAccount!!
    }

@Suppress("ObjectPropertyName")
private var _TargetAccount: ImageVector? = null
