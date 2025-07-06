package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SmartCard: ImageVector
    get() {
        if (_SmartCard != null) {
            return _SmartCard!!
        }
        _SmartCard = ImageVector.Builder(
            name = "SmartCard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 3f)
                horizontalLineTo(22f)
                arcTo(2.07f, 2.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 5f)
                verticalLineTo(19f)
                arcTo(2.07f, 2.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 21f)
                horizontalLineTo(2f)
                arcTo(2.07f, 2.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 19f)
                verticalLineTo(5f)
                arcTo(2.07f, 2.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 3f)
                moveTo(8f, 13.91f)
                curveTo(6f, 13.91f, 2f, 15f, 2f, 17f)
                verticalLineTo(18f)
                horizontalLineTo(14f)
                verticalLineTo(17f)
                curveTo(14f, 15f, 10f, 13.91f, 8f, 13.91f)
                moveTo(8f, 6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 11f, 9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 6f)
                moveTo(17f, 10f)
                verticalLineTo(13f)
                horizontalLineTo(21f)
                verticalLineTo(10f)
                horizontalLineTo(17f)
            }
        }.build()

        return _SmartCard!!
    }

@Suppress("ObjectPropertyName")
private var _SmartCard: ImageVector? = null
