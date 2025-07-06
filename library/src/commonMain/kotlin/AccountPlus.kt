package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountPlus: ImageVector
    get() {
        if (_AccountPlus != null) {
            return _AccountPlus!!
        }
        _AccountPlus = ImageVector.Builder(
            name = "AccountPlus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 14f)
                curveTo(12.33f, 14f, 7f, 15.33f, 7f, 18f)
                verticalLineTo(20f)
                horizontalLineTo(23f)
                verticalLineTo(18f)
                curveTo(23f, 15.33f, 17.67f, 14f, 15f, 14f)
                moveTo(6f, 10f)
                verticalLineTo(7f)
                horizontalLineTo(4f)
                verticalLineTo(10f)
                horizontalLineTo(1f)
                verticalLineTo(12f)
                horizontalLineTo(4f)
                verticalLineTo(15f)
                horizontalLineTo(6f)
                verticalLineTo(12f)
                horizontalLineTo(9f)
                verticalLineTo(10f)
                moveTo(15f, 12f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 4f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 12f)
                close()
            }
        }.build()

        return _AccountPlus!!
    }

@Suppress("ObjectPropertyName")
private var _AccountPlus: ImageVector? = null
