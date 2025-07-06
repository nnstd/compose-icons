package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Api: ImageVector
    get() {
        if (_Api != null) {
            return _Api!!
        }
        _Api = ImageVector.Builder(
            name = "Api",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 7f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 9f)
                verticalLineTo(17f)
                horizontalLineTo(5f)
                verticalLineTo(13f)
                horizontalLineTo(7f)
                verticalLineTo(17f)
                horizontalLineTo(9f)
                verticalLineTo(9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 7f)
                moveTo(7f, 11f)
                horizontalLineTo(5f)
                verticalLineTo(9f)
                horizontalLineTo(7f)
                moveTo(14f, 7f)
                horizontalLineTo(10f)
                verticalLineTo(17f)
                horizontalLineTo(12f)
                verticalLineTo(13f)
                horizontalLineTo(14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 11f)
                verticalLineTo(9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 7f)
                moveTo(14f, 11f)
                horizontalLineTo(12f)
                verticalLineTo(9f)
                horizontalLineTo(14f)
                moveTo(20f, 9f)
                verticalLineTo(15f)
                horizontalLineTo(21f)
                verticalLineTo(17f)
                horizontalLineTo(17f)
                verticalLineTo(15f)
                horizontalLineTo(18f)
                verticalLineTo(9f)
                horizontalLineTo(17f)
                verticalLineTo(7f)
                horizontalLineTo(21f)
                verticalLineTo(9f)
                close()
            }
        }.build()

        return _Api!!
    }

@Suppress("ObjectPropertyName")
private var _Api: ImageVector? = null
