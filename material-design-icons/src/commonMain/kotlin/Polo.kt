package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Polo: ImageVector
    get() {
        if (_Polo != null) {
            return _Polo!!
        }
        _Polo = ImageVector.Builder(
            name = "Polo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 9.5f)
                curveTo(22f, 10.88f, 20.88f, 12f, 19.5f, 12f)
                reflectiveCurveTo(17f, 10.88f, 17f, 9.5f)
                reflectiveCurveTo(18.12f, 7f, 19.5f, 7f)
                reflectiveCurveTo(22f, 8.12f, 22f, 9.5f)
                moveTo(11f, 17f)
                verticalLineTo(3f)
                horizontalLineTo(8f)
                verticalLineTo(17f)
                horizontalLineTo(2f)
                lineTo(6f, 21f)
                horizontalLineTo(13f)
                verticalLineTo(17f)
                horizontalLineTo(11f)
                moveTo(16f, 17f)
                horizontalLineTo(14f)
                verticalLineTo(21f)
                horizontalLineTo(16f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _Polo!!
    }

@Suppress("ObjectPropertyName")
private var _Polo: ImageVector? = null
