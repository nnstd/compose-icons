package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HospitalBuilding: ImageVector
    get() {
        if (_HospitalBuilding != null) {
            return _HospitalBuilding!!
        }
        _HospitalBuilding = ImageVector.Builder(
            name = "HospitalBuilding",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 22f)
                verticalLineTo(7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 6f)
                horizontalLineTo(7f)
                verticalLineTo(2f)
                horizontalLineTo(17f)
                verticalLineTo(6f)
                horizontalLineTo(21f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 7f)
                verticalLineTo(22f)
                horizontalLineTo(14f)
                verticalLineTo(17f)
                horizontalLineTo(10f)
                verticalLineTo(22f)
                horizontalLineTo(2f)
                moveTo(9f, 4f)
                verticalLineTo(10f)
                horizontalLineTo(11f)
                verticalLineTo(8f)
                horizontalLineTo(13f)
                verticalLineTo(10f)
                horizontalLineTo(15f)
                verticalLineTo(4f)
                horizontalLineTo(13f)
                verticalLineTo(6f)
                horizontalLineTo(11f)
                verticalLineTo(4f)
                horizontalLineTo(9f)
                moveTo(4f, 20f)
                horizontalLineTo(8f)
                verticalLineTo(17f)
                horizontalLineTo(4f)
                verticalLineTo(20f)
                moveTo(4f, 15f)
                horizontalLineTo(8f)
                verticalLineTo(12f)
                horizontalLineTo(4f)
                verticalLineTo(15f)
                moveTo(16f, 20f)
                horizontalLineTo(20f)
                verticalLineTo(17f)
                horizontalLineTo(16f)
                verticalLineTo(20f)
                moveTo(16f, 15f)
                horizontalLineTo(20f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                verticalLineTo(15f)
                moveTo(10f, 15f)
                horizontalLineTo(14f)
                verticalLineTo(12f)
                horizontalLineTo(10f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _HospitalBuilding!!
    }

@Suppress("ObjectPropertyName")
private var _HospitalBuilding: ImageVector? = null
