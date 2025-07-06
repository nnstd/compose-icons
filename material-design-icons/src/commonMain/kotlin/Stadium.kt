package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Stadium: ImageVector
    get() {
        if (_Stadium != null) {
            return _Stadium!!
        }
        _Stadium = ImageVector.Builder(
            name = "Stadium",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 5f)
                lineTo(3f, 7f)
                verticalLineTo(3f)
                lineTo(7f, 5f)
                moveTo(18f, 3f)
                verticalLineTo(7f)
                lineTo(22f, 5f)
                lineTo(18f, 3f)
                moveTo(11f, 2f)
                verticalLineTo(6f)
                lineTo(15f, 4f)
                lineTo(11f, 2f)
                moveTo(5f, 10f)
                curveTo(6.4f, 10.5f, 8.8f, 11f, 12f, 11f)
                reflectiveCurveTo(17.6f, 10.5f, 19f, 10f)
                curveTo(19f, 9.8f, 16.2f, 9f, 12f, 9f)
                reflectiveCurveTo(5f, 9.9f, 5f, 10f)
                moveTo(15f, 17f)
                horizontalLineTo(9f)
                verticalLineTo(21.9f)
                curveTo(4.9f, 21.5f, 2f, 20.4f, 2f, 19f)
                verticalLineTo(10f)
                curveTo(2f, 8.3f, 6.5f, 7f, 12f, 7f)
                reflectiveCurveTo(22f, 8.3f, 22f, 10f)
                verticalLineTo(19f)
                curveTo(22f, 20.3f, 19.1f, 21.5f, 15f, 21.9f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _Stadium!!
    }

@Suppress("ObjectPropertyName")
private var _Stadium: ImageVector? = null
