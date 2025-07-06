package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Toaster: ImageVector
    get() {
        if (_Toaster != null) {
            return _Toaster!!
        }
        _Toaster = ImageVector.Builder(
            name = "Toaster",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 9f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 11f)
                horizontalLineTo(2f)
                verticalLineTo(13f)
                horizontalLineTo(3f)
                verticalLineTo(20f)
                horizontalLineTo(21f)
                verticalLineTo(13f)
                horizontalLineTo(22f)
                verticalLineTo(11f)
                moveTo(17f, 15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 19f, 13f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 15f)
                moveTo(18f, 8f)
                horizontalLineTo(6f)
                curveTo(6.33f, 5.75f, 8.88f, 4f, 12f, 4f)
                reflectiveCurveTo(17.63f, 5.75f, 18f, 8f)
                close()
            }
        }.build()

        return _Toaster!!
    }

@Suppress("ObjectPropertyName")
private var _Toaster: ImageVector? = null
