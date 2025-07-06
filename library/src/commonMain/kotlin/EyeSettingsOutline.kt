package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EyeSettingsOutline: ImageVector
    get() {
        if (_EyeSettingsOutline != null) {
            return _EyeSettingsOutline!!
        }
        _EyeSettingsOutline = ImageVector.Builder(
            name = "EyeSettingsOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 12f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 15f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 12f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 9f)
                moveTo(12f, 4.5f)
                curveTo(16.86f, 4.5f, 21.22f, 7.5f, 23f, 12f)
                curveTo(20.61f, 18.08f, 13.75f, 21.06f, 7.67f, 18.67f)
                curveTo(4.62f, 17.47f, 2.2f, 15.06f, 1f, 12f)
                curveTo(2.78f, 7.5f, 7.14f, 4.5f, 12f, 4.5f)
                moveTo(3.18f, 12f)
                curveTo(5.56f, 16.87f, 11.45f, 18.89f, 16.32f, 16.5f)
                curveTo(18.28f, 15.54f, 19.86f, 13.96f, 20.82f, 12f)
                curveTo(18.44f, 7.13f, 12.55f, 5.11f, 7.68f, 7.5f)
                curveTo(5.72f, 8.46f, 4.14f, 10.04f, 3.18f, 12f)
                moveTo(9f, 22f)
                horizontalLineTo(7f)
                verticalLineTo(24f)
                horizontalLineTo(9f)
                verticalLineTo(22f)
                moveTo(13f, 22f)
                horizontalLineTo(11f)
                verticalLineTo(24f)
                horizontalLineTo(13f)
                verticalLineTo(22f)
                moveTo(17f, 22f)
                horizontalLineTo(15f)
                verticalLineTo(24f)
                horizontalLineTo(17f)
                verticalLineTo(22f)
                close()
            }
        }.build()

        return _EyeSettingsOutline!!
    }

@Suppress("ObjectPropertyName")
private var _EyeSettingsOutline: ImageVector? = null
