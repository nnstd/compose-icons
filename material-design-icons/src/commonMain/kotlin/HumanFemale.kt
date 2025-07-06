package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HumanFemale: ImageVector
    get() {
        if (_HumanFemale != null) {
            return _HumanFemale!!
        }
        _HumanFemale = ImageVector.Builder(
            name = "HumanFemale",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                moveTo(10.5f, 22f)
                verticalLineTo(16f)
                horizontalLineTo(7.5f)
                lineTo(10.09f, 8.41f)
                curveTo(10.34f, 7.59f, 11.1f, 7f, 12f, 7f)
                curveTo(12.9f, 7f, 13.66f, 7.59f, 13.91f, 8.41f)
                lineTo(16.5f, 16f)
                horizontalLineTo(13.5f)
                verticalLineTo(22f)
                horizontalLineTo(10.5f)
                close()
            }
        }.build()

        return _HumanFemale!!
    }

@Suppress("ObjectPropertyName")
private var _HumanFemale: ImageVector? = null
