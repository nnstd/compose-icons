package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CheckboxBlankBadge: ImageVector
    get() {
        if (_CheckboxBlankBadge != null) {
            return _CheckboxBlankBadge!!
        }
        _CheckboxBlankBadge = ImageVector.Builder(
            name = "CheckboxBlankBadge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 4.5f)
                curveTo(23f, 6.43f, 21.43f, 8f, 19.5f, 8f)
                reflectiveCurveTo(16f, 6.43f, 16f, 4.5f)
                reflectiveCurveTo(17.57f, 1f, 19.5f, 1f)
                reflectiveCurveTo(23f, 2.57f, 23f, 4.5f)
                moveTo(19.5f, 10f)
                curveTo(16.47f, 10f, 14f, 7.53f, 14f, 4.5f)
                curveTo(14f, 4f, 14.08f, 3.5f, 14.21f, 3f)
                horizontalLineTo(5f)
                curveTo(3.89f, 3f, 3f, 3.89f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.11f, 3.9f, 21f, 5f, 21f)
                horizontalLineTo(19f)
                curveTo(20.11f, 21f, 21f, 20.11f, 21f, 19f)
                verticalLineTo(9.79f)
                curveTo(20.5f, 9.92f, 20f, 10f, 19.5f, 10f)
                close()
            }
        }.build()

        return _CheckboxBlankBadge!!
    }

@Suppress("ObjectPropertyName")
private var _CheckboxBlankBadge: ImageVector? = null
