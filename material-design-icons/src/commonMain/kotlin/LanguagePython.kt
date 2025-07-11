package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LanguagePython: ImageVector
    get() {
        if (_LanguagePython != null) {
            return _LanguagePython!!
        }
        _LanguagePython = ImageVector.Builder(
            name = "LanguagePython",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.14f, 7.5f)
                arcTo(2.86f, 2.86f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 10.36f)
                verticalLineTo(14.14f)
                arcTo(2.86f, 2.86f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.14f, 17f)
                horizontalLineTo(12f)
                curveTo(12f, 17.39f, 12.32f, 17.96f, 12.71f, 17.96f)
                horizontalLineTo(17f)
                verticalLineTo(19.64f)
                arcTo(2.86f, 2.86f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.14f, 22.5f)
                horizontalLineTo(9.86f)
                arcTo(2.86f, 2.86f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 19.64f)
                verticalLineTo(15.89f)
                curveTo(7f, 14.31f, 8.28f, 13.04f, 9.86f, 13.04f)
                horizontalLineTo(15.11f)
                curveTo(16.69f, 13.04f, 17.96f, 11.76f, 17.96f, 10.18f)
                verticalLineTo(7.5f)
                horizontalLineTo(19.14f)
                moveTo(14.86f, 19.29f)
                curveTo(14.46f, 19.29f, 14.14f, 19.59f, 14.14f, 20.18f)
                curveTo(14.14f, 20.77f, 14.46f, 20.89f, 14.86f, 20.89f)
                arcTo(0.71f, 0.71f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.57f, 20.18f)
                curveTo(15.57f, 19.59f, 15.25f, 19.29f, 14.86f, 19.29f)
                moveTo(4.86f, 17.5f)
                curveTo(3.28f, 17.5f, 2f, 16.22f, 2f, 14.64f)
                verticalLineTo(10.86f)
                curveTo(2f, 9.28f, 3.28f, 8f, 4.86f, 8f)
                horizontalLineTo(12f)
                curveTo(12f, 7.61f, 11.68f, 7.04f, 11.29f, 7.04f)
                horizontalLineTo(7f)
                verticalLineTo(5.36f)
                curveTo(7f, 3.78f, 8.28f, 2.5f, 9.86f, 2.5f)
                horizontalLineTo(14.14f)
                curveTo(15.72f, 2.5f, 17f, 3.78f, 17f, 5.36f)
                verticalLineTo(9.11f)
                curveTo(17f, 10.69f, 15.72f, 11.96f, 14.14f, 11.96f)
                horizontalLineTo(8.89f)
                curveTo(7.31f, 11.96f, 6.04f, 13.24f, 6.04f, 14.82f)
                verticalLineTo(17.5f)
                horizontalLineTo(4.86f)
                moveTo(9.14f, 5.71f)
                curveTo(9.54f, 5.71f, 9.86f, 5.41f, 9.86f, 4.82f)
                curveTo(9.86f, 4.23f, 9.54f, 4.11f, 9.14f, 4.11f)
                curveTo(8.75f, 4.11f, 8.43f, 4.23f, 8.43f, 4.82f)
                curveTo(8.43f, 5.41f, 8.75f, 5.71f, 9.14f, 5.71f)
                close()
            }
        }.build()

        return _LanguagePython!!
    }

@Suppress("ObjectPropertyName")
private var _LanguagePython: ImageVector? = null
