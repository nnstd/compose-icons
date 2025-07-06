package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EyeSettings: ImageVector
    get() {
        if (_EyeSettings != null) {
            return _EyeSettings!!
        }
        _EyeSettings = ImageVector.Builder(
            name = "EyeSettings",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 12f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 15f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 12f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 9f)
                moveTo(12f, 17f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 12f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 7f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 12f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 17f)
                moveTo(12f, 4.5f)
                curveTo(7.14f, 4.5f, 2.78f, 7.5f, 1f, 12f)
                curveTo(3.39f, 18.08f, 10.25f, 21.06f, 16.33f, 18.67f)
                curveTo(19.38f, 17.47f, 21.8f, 15.06f, 23f, 12f)
                curveTo(21.22f, 7.5f, 16.86f, 4.5f, 12f, 4.5f)
                moveTo(7f, 22f)
                horizontalLineTo(9f)
                verticalLineTo(24f)
                horizontalLineTo(7f)
                verticalLineTo(22f)
                moveTo(11f, 22f)
                horizontalLineTo(13f)
                verticalLineTo(24f)
                horizontalLineTo(11f)
                verticalLineTo(22f)
                moveTo(15f, 22f)
                horizontalLineTo(17f)
                verticalLineTo(24f)
                horizontalLineTo(15f)
                verticalLineTo(22f)
                close()
            }
        }.build()

        return _EyeSettings!!
    }

@Suppress("ObjectPropertyName")
private var _EyeSettings: ImageVector? = null
