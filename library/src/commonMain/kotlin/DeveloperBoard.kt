package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DeveloperBoard: ImageVector
    get() {
        if (_DeveloperBoard != null) {
            return _DeveloperBoard!!
        }
        _DeveloperBoard = ImageVector.Builder(
            name = "DeveloperBoard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 9f)
                verticalLineTo(7f)
                horizontalLineTo(20f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 3f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 21f)
                horizontalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 19f)
                verticalLineTo(17f)
                horizontalLineTo(22f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(13f)
                horizontalLineTo(22f)
                verticalLineTo(11f)
                horizontalLineTo(20f)
                verticalLineTo(9f)
                horizontalLineTo(22f)
                moveTo(18f, 19f)
                horizontalLineTo(4f)
                verticalLineTo(5f)
                horizontalLineTo(18f)
                verticalLineTo(19f)
                moveTo(6f, 13f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                horizontalLineTo(6f)
                verticalLineTo(13f)
                moveTo(12f, 7f)
                horizontalLineTo(16f)
                verticalLineTo(10f)
                horizontalLineTo(12f)
                verticalLineTo(7f)
                moveTo(6f, 7f)
                horizontalLineTo(11f)
                verticalLineTo(12f)
                horizontalLineTo(6f)
                verticalLineTo(7f)
                moveTo(12f, 11f)
                horizontalLineTo(16f)
                verticalLineTo(17f)
                horizontalLineTo(12f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _DeveloperBoard!!
    }

@Suppress("ObjectPropertyName")
private var _DeveloperBoard: ImageVector? = null
