package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Lotion: ImageVector
    get() {
        if (_Lotion != null) {
            return _Lotion!!
        }
        _Lotion = ImageVector.Builder(
            name = "Lotion",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.5f, 6.5f)
                curveTo(15.5f, 5.66f, 17f, 4f, 17f, 4f)
                reflectiveCurveTo(18.5f, 5.66f, 18.5f, 6.5f)
                curveTo(18.5f, 7.33f, 17.83f, 8f, 17f, 8f)
                reflectiveCurveTo(15.5f, 7.33f, 15.5f, 6.5f)
                moveTo(19.5f, 15f)
                curveTo(20.88f, 15f, 22f, 13.88f, 22f, 12.5f)
                curveTo(22f, 10.83f, 19.5f, 8f, 19.5f, 8f)
                reflectiveCurveTo(17f, 10.83f, 17f, 12.5f)
                curveTo(17f, 13.88f, 18.12f, 15f, 19.5f, 15f)
                moveTo(16f, 12f)
                verticalLineTo(22f)
                horizontalLineTo(4f)
                verticalLineTo(12f)
                curveTo(4f, 9.03f, 6.16f, 6.57f, 9f, 6.09f)
                verticalLineTo(4f)
                horizontalLineTo(7f)
                verticalLineTo(2f)
                horizontalLineTo(13f)
                curveTo(14.13f, 2f, 15.15f, 2.39f, 16f, 3f)
                lineTo(14.56f, 4.44f)
                curveTo(14.1f, 4.17f, 13.57f, 4f, 13f, 4f)
                horizontalLineTo(11f)
                verticalLineTo(6.09f)
                curveTo(13.84f, 6.57f, 16f, 9.03f, 16f, 12f)
                close()
            }
        }.build()

        return _Lotion!!
    }

@Suppress("ObjectPropertyName")
private var _Lotion: ImageVector? = null
