package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PlusCircleMultiple: ImageVector
    get() {
        if (_PlusCircleMultiple != null) {
            return _PlusCircleMultiple!!
        }
        _PlusCircleMultiple = ImageVector.Builder(
            name = "PlusCircleMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 12f)
                curveTo(2f, 9.2f, 3.6f, 6.8f, 6f, 5.7f)
                verticalLineTo(3.5f)
                curveTo(2.5f, 4.8f, 0f, 8.1f, 0f, 12f)
                reflectiveCurveTo(2.5f, 19.2f, 6f, 20.5f)
                verticalLineTo(18.3f)
                curveTo(3.6f, 17.2f, 2f, 14.8f, 2f, 12f)
                moveTo(15f, 3f)
                curveTo(10f, 3f, 6f, 7f, 6f, 12f)
                reflectiveCurveTo(10f, 21f, 15f, 21f)
                reflectiveCurveTo(24f, 17f, 24f, 12f)
                reflectiveCurveTo(20f, 3f, 15f, 3f)
                moveTo(20f, 13f)
                horizontalLineTo(16f)
                verticalLineTo(17f)
                horizontalLineTo(14f)
                verticalLineTo(13f)
                horizontalLineTo(10f)
                verticalLineTo(11f)
                horizontalLineTo(14f)
                verticalLineTo(7f)
                horizontalLineTo(16f)
                verticalLineTo(11f)
                horizontalLineTo(20f)
                verticalLineTo(13f)
                close()
            }
        }.build()

        return _PlusCircleMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _PlusCircleMultiple: ImageVector? = null
