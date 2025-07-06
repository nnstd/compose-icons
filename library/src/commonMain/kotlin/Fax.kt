package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Fax: ImageVector
    get() {
        if (_Fax != null) {
            return _Fax!!
        }
        _Fax = ImageVector.Builder(
            name = "Fax",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 9f)
                horizontalLineTo(18f)
                verticalLineTo(4f)
                horizontalLineTo(8f)
                verticalLineTo(20f)
                horizontalLineTo(22f)
                verticalLineTo(12f)
                curveTo(22f, 10.34f, 20.66f, 9f, 19f, 9f)
                moveTo(10f, 6f)
                horizontalLineTo(16f)
                verticalLineTo(9f)
                horizontalLineTo(10f)
                verticalLineTo(6f)
                moveTo(14f, 17f)
                horizontalLineTo(10f)
                verticalLineTo(12f)
                horizontalLineTo(14f)
                verticalLineTo(17f)
                moveTo(16f, 17f)
                curveTo(15.45f, 17f, 15f, 16.55f, 15f, 16f)
                curveTo(15f, 15.45f, 15.45f, 15f, 16f, 15f)
                curveTo(16.55f, 15f, 17f, 15.45f, 17f, 16f)
                curveTo(17f, 16.55f, 16.55f, 17f, 16f, 17f)
                moveTo(16f, 14f)
                curveTo(15.45f, 14f, 15f, 13.55f, 15f, 13f)
                reflectiveCurveTo(15.45f, 12f, 16f, 12f)
                curveTo(16.55f, 12f, 17f, 12.45f, 17f, 13f)
                reflectiveCurveTo(16.55f, 14f, 16f, 14f)
                moveTo(19f, 17f)
                curveTo(18.45f, 17f, 18f, 16.55f, 18f, 16f)
                curveTo(18f, 15.45f, 18.45f, 15f, 19f, 15f)
                reflectiveCurveTo(20f, 15.45f, 20f, 16f)
                curveTo(20f, 16.55f, 19.55f, 17f, 19f, 17f)
                moveTo(19f, 14f)
                curveTo(18.45f, 14f, 18f, 13.55f, 18f, 13f)
                reflectiveCurveTo(18.45f, 12f, 19f, 12f)
                reflectiveCurveTo(20f, 12.45f, 20f, 13f)
                reflectiveCurveTo(19.55f, 14f, 19f, 14f)
                moveTo(4.5f, 8f)
                curveTo(3.12f, 8f, 2f, 9.12f, 2f, 10.5f)
                verticalLineTo(18.5f)
                curveTo(2f, 19.88f, 3.12f, 21f, 4.5f, 21f)
                reflectiveCurveTo(7f, 19.88f, 7f, 18.5f)
                verticalLineTo(10.5f)
                curveTo(7f, 9.12f, 5.88f, 8f, 4.5f, 8f)
                close()
            }
        }.build()

        return _Fax!!
    }

@Suppress("ObjectPropertyName")
private var _Fax: ImageVector? = null
