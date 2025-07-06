package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SmartCardOutline: ImageVector
    get() {
        if (_SmartCardOutline != null) {
            return _SmartCardOutline!!
        }
        _SmartCardOutline = ImageVector.Builder(
            name = "SmartCardOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 3f)
                horizontalLineTo(2f)
                arcTo(2.07f, 2.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 5f)
                verticalLineTo(19f)
                arcTo(2.07f, 2.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 21f)
                horizontalLineTo(22f)
                arcTo(2.07f, 2.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 19f)
                verticalLineTo(5f)
                arcTo(2.07f, 2.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 3f)
                moveTo(22f, 19f)
                horizontalLineTo(2f)
                verticalLineTo(5f)
                horizontalLineTo(22f)
                moveTo(14f, 17f)
                verticalLineTo(15.75f)
                curveTo(14f, 14.09f, 10.66f, 13.25f, 9f, 13.25f)
                reflectiveCurveTo(4f, 14.09f, 4f, 15.75f)
                verticalLineTo(17f)
                horizontalLineTo(14f)
                moveTo(9f, 7f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 11.5f, 9.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 7f)
                moveTo(15f, 10f)
                verticalLineTo(13f)
                horizontalLineTo(19f)
                verticalLineTo(10f)
                horizontalLineTo(15f)
            }
        }.build()

        return _SmartCardOutline!!
    }

@Suppress("ObjectPropertyName")
private var _SmartCardOutline: ImageVector? = null
