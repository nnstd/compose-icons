package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Balcony: ImageVector
    get() {
        if (_Balcony != null) {
            return _Balcony!!
        }
        _Balcony = ImageVector.Builder(
            name = "Balcony",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 10f)
                verticalLineTo(12f)
                horizontalLineTo(8f)
                verticalLineTo(10f)
                horizontalLineTo(10f)
                moveTo(16f, 12f)
                verticalLineTo(10f)
                horizontalLineTo(14f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                moveTo(21f, 14f)
                verticalLineTo(22f)
                horizontalLineTo(3f)
                verticalLineTo(14f)
                horizontalLineTo(4f)
                verticalLineTo(10f)
                curveTo(4f, 5.58f, 7.58f, 2f, 12f, 2f)
                reflectiveCurveTo(20f, 5.58f, 20f, 10f)
                verticalLineTo(14f)
                horizontalLineTo(21f)
                moveTo(7f, 16f)
                horizontalLineTo(5f)
                verticalLineTo(20f)
                horizontalLineTo(7f)
                verticalLineTo(16f)
                moveTo(11f, 16f)
                horizontalLineTo(9f)
                verticalLineTo(20f)
                horizontalLineTo(11f)
                verticalLineTo(16f)
                moveTo(11f, 4.08f)
                curveTo(8.16f, 4.56f, 6f, 7.03f, 6f, 10f)
                verticalLineTo(14f)
                horizontalLineTo(11f)
                verticalLineTo(4.08f)
                moveTo(13f, 14f)
                horizontalLineTo(18f)
                verticalLineTo(10f)
                curveTo(18f, 7.03f, 15.84f, 4.56f, 13f, 4.08f)
                verticalLineTo(14f)
                moveTo(15f, 16f)
                horizontalLineTo(13f)
                verticalLineTo(20f)
                horizontalLineTo(15f)
                verticalLineTo(16f)
                moveTo(19f, 16f)
                horizontalLineTo(17f)
                verticalLineTo(20f)
                horizontalLineTo(19f)
                verticalLineTo(16f)
                close()
            }
        }.build()

        return _Balcony!!
    }

@Suppress("ObjectPropertyName")
private var _Balcony: ImageVector? = null
