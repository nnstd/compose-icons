package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HumanPregnant: ImageVector
    get() {
        if (_HumanPregnant != null) {
            return _HumanPregnant!!
        }
        _HumanPregnant = ImageVector.Builder(
            name = "HumanPregnant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 4f)
                curveTo(9f, 2.89f, 9.89f, 2f, 11f, 2f)
                curveTo(12.11f, 2f, 13f, 2.89f, 13f, 4f)
                curveTo(13f, 5.11f, 12.11f, 6f, 11f, 6f)
                curveTo(9.89f, 6f, 9f, 5.11f, 9f, 4f)
                moveTo(16f, 13f)
                curveTo(16f, 11.66f, 15.17f, 10.5f, 14f, 10f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 7f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 10f)
                verticalLineTo(17f)
                horizontalLineTo(10f)
                verticalLineTo(22f)
                horizontalLineTo(13f)
                verticalLineTo(17f)
                horizontalLineTo(16f)
                verticalLineTo(13f)
                close()
            }
        }.build()

        return _HumanPregnant!!
    }

@Suppress("ObjectPropertyName")
private var _HumanPregnant: ImageVector? = null
